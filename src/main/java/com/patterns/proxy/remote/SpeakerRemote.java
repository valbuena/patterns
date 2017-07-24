package com.patterns.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SpeakerRemote extends Remote {

    public void sayHello() throws RemoteException;

    public void saySomething() throws RemoteException;

    public void sayGoodBye() throws RemoteException;
}
