package com.patterns.strategy.ducks;

import com.patterns.strategy.Duck;
import com.patterns.strategy.behaviors.FlyNoWay;
import com.patterns.strategy.behaviors.MakeSoundMute;

/**
 * Created by pep on 6/01/16.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck(){
        System.out.println("----------");
        System.out.println("DECOY DUCK");
        System.out.println("----------");
        this.setFlyBehavior(new FlyNoWay());
        this.setMakeSoundBehavior(new MakeSoundMute());
    }

    @Override
    public void display() {
        System.out.println("I look like a wooden decoy duck");
    }
}
