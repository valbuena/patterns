package com.patterns.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SpeakerClient {

    private final static String LOCATION = "rmi://127.0.0.1/speakerRemote";

    public static void executeClient(){

        System.out.println("---- CLIENT SERVER");

        try {
            SpeakerRemote remote = (SpeakerRemote) Naming.lookup(LOCATION);
            remote.sayHello();
            remote.saySomething();
            remote.sayGoodBye();

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
