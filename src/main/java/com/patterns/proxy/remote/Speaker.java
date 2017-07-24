package com.patterns.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Speaker extends UnicastRemoteObject implements SpeakerRemote {

    protected Speaker() throws RemoteException {
    }

    public void sayHello (){
        System.out.println("** Hey everybody");
    }

    @Override
    public void saySomething() throws RemoteException {
        System.out.println("** Something");
    }

    public void sayGoodBye (){
        System.out.println("** Bye, nice to meet you");
    }
}
