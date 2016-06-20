package com.patterns.factory.simple.pizza;

/**
 * Created by pep on 24/01/16.
 */
public class Pizza {


    public void prepare(){
        System.out.println("Preparing ...");
    };

    public void bake(){
        System.out.println("Baking ...");
    }

    public void cut(){
        System.out.println("Cutting ...");
    }

    public void box(){
        System.out.println("Boxing ...");
    }
}
