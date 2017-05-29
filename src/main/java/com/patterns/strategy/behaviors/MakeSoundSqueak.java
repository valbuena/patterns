package com.patterns.strategy.behaviors;

/**
 * Created by pep on 6/01/16.
 */
public class MakeSoundSqueak implements MakeSoundBehavior {

    @Override
    public void makeSound() {
        System.out.println("Sounding: SQUEAK!!!!!!!");
    }
}
