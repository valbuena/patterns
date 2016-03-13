package com.patterns.singleton.multithreading;

/**
 * Created by pep on 13/03/16.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.print("Once multithreading");
    }


    public static synchronized Singleton getSingleton(){
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }



}
