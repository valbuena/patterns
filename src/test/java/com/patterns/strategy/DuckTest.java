package com.patterns.strategy;

import com.patterns.strategy.ducks.DecoyDuck;
import com.patterns.strategy.ducks.MallardDuck;
import com.patterns.strategy.ducks.RedHeadDuck;
import com.patterns.strategy.ducks.RubberDuck;
import org.junit.Test;

/**
 * Created by pep on 6/01/16.
 */
public class DuckTest {

    @Test
    public void testMallardDucks ()
    {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performMakeSound();

    }

    @Test
    public void testRedHeadDucks ()
    {
        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.swim();
        redHead.performFly();
        redHead.performMakeSound();


    }

    @Test
    public void testRubberDucks ()
    {
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();
        rubber.performFly();
        rubber.performMakeSound();


    }

    @Test
    public void testDecoyDucks ()
    {
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.swim();
        decoy.performFly();
        decoy.performMakeSound();


    }
}
