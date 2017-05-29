package com.patterns.singleton.simple;

/**
 * Created by pep on 13/03/16.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton (){
        System.out.print("Once simple");
    }


    public static Singleton getSingleton(){
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }



}
