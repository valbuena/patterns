package com.patterns.strategy.behaviors;

/**
 * Created by pep on 6/01/16.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly :  with WINGS");
    }
}
