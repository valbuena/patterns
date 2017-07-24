package com.patterns.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SpeakerServer {

    private final static String LOCATION = "rmi://127.0.0.1/speakerRemote";

    public static void registryServer(){

        System.out.println("---- REMOTE SERVER");

        try {
            SpeakerRemote remote = new Speaker();
            Naming.rebind(LOCATION, remote);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
