package com.patterns.strategy.behaviors;

/**
 * Created by pep on 6/01/16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly : can't FLY");
    }
}
