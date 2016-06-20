package com.patterns.singleton.nolazy;

/**
 * Created by pep on 13/03/16.
 */
public class Singleton {

    //Avoid multithreading
    private static Singleton instance = new Singleton();

    private Singleton(){
        System.out.print("Once no lazy");
    }


    public static Singleton getSingleton(){
        return instance;
    }



}
