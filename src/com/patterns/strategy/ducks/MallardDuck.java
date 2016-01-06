package com.patterns.strategy.ducks;

import com.patterns.strategy.Duck;
import com.patterns.strategy.behaviors.FlyWithWings;
import com.patterns.strategy.behaviors.MakeSoundQuack;

/**
 * Created by pep on 6/01/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        System.out.println("------------");
        System.out.println("MALLARD DUCK");
        System.out.println("------------");
        this.setFlyBehavior(new FlyWithWings());
        this.setMakeSoundBehavior(new MakeSoundQuack());
    }

    @Override
    public void display() {
        System.out.println("I look like a mallard duck.");
    }
}
