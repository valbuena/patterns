package com.patterns.strategy.ducks;

import com.patterns.strategy.Duck;
import com.patterns.strategy.behaviors.FlyNoWay;
import com.patterns.strategy.behaviors.MakeSoundSqueak;

/**
 * Created by pep on 6/01/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        System.out.println("-----------");
        System.out.println("RUBBER DUCK");
        System.out.println("-----------");
        this.setFlyBehavior(new FlyNoWay());
        this.setMakeSoundBehavior(new MakeSoundSqueak());
    }

    @Override
    public void display() {
        System.out.println("I look like a rubber duck in the bathroom");
    }
}
