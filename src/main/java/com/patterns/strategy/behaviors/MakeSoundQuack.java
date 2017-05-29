package com.patterns.strategy.behaviors;

/**
 * Created by pep on 6/01/16.
 */
public class MakeSoundQuack implements MakeSoundBehavior {
    @Override
    public void makeSound() {
        System.out.println("Sounding: QUACK!!!!!");
    }
}
