package com.patterns.strategy.ducks;

import com.patterns.strategy.Duck;
import com.patterns.strategy.behaviors.FlyWithWings;
import com.patterns.strategy.behaviors.MakeSoundQuack;

/**
 * Created by pep on 6/01/16.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        System.out.println("-------------");
        System.out.println("RED HEAD DUCK");
        System.out.println("-------------");
        this.setFlyBehavior(new FlyWithWings());
        this.setMakeSoundBehavior(new MakeSoundQuack());
    }

    @Override
    public void display() {
        System.out.println("I look like a red head duck.");
    }
}
