package com.patterns.strategy;

import com.patterns.strategy.behaviors.FlyBehavior;
import com.patterns.strategy.behaviors.MakeSoundBehavior;

/**
 * Created by evalb on 24/12/15.
 */
public abstract class Duck {

    public Duck(){}



    private FlyBehavior flyBehavior;

    private MakeSoundBehavior makeSoundBehavior;


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setMakeSoundBehavior(MakeSoundBehavior makeSoundBehavior) {
        this.makeSoundBehavior = makeSoundBehavior;
    }


    public  void performMakeSound(){
        flyBehavior.fly();
    }

    public  void performFly(){
        makeSoundBehavior.makeSound();
    }

    public  void swim()
    {
        System.out.println("All the ducks swin by the time being");
    }

    public abstract void display();

}
