package com.patterns.proxy.remote;

import org.junit.Test;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SpeakerTest {

    private final static int REGISTRY_PORT = 1111;

    @Test
    public void testSpeakerRemote () throws RemoteException {
        final Registry registry = LocateRegistry.createRegistry(REGISTRY_PORT);

        SpeakerServer.registryServer();
        SpeakerClient.executeClient();

        UnicastRemoteObject.unexportObject(registry, true);

    }
}
