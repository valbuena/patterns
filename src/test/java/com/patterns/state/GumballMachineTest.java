package com.patterns.state;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GumballMachineTest {

    @Test
    public void testGetBall(){
        System.out.println("----------------------------");
        System.out.println("Test GET BALLS");
        GumballMachine machine = new GumballMachine(5);
        checkMachine(machine, StateType.NOCOIN, 5);
        machine.insertCoin();
        machine.turnCrank();
        checkMachine(machine, StateType.NOCOIN, 4);
    }

    @Test
    public void testEjectCoin(){
        System.out.println("----------------------------");
        System.out.println("Test EJECT COIN");
        GumballMachine machine = new GumballMachine(5);
        checkMachine(machine, StateType.NOCOIN, 5);
        machine.insertCoin();
        machine.ejectCoin();
        checkMachine(machine, StateType.NOCOIN, 5);
    }

    @Test
    public void testFinishBalls(){
        System.out.println("----------------------------");
        System.out.println("Test FINISH BALLS");
        GumballMachine machine = new GumballMachine(1);
        checkMachine(machine, StateType.NOCOIN, 1);
        machine.insertCoin();
        machine.turnCrank();
        checkMachine(machine, StateType.SOLDOUT, 0);

        machine.insertCoin();
        checkMachine(machine, StateType.SOLDOUT, 0);
    }

    @Test
    public void testIncreaseBalls() {
        System.out.println("----------------------------");
        System.out.println("Test INCREASE BALLS");
        GumballMachine machine = new GumballMachine(1);
        checkMachine(machine, StateType.NOCOIN, 1);
        machine.insertCoin();
        machine.turnCrank();
        checkMachine(machine, StateType.SOLDOUT, 0);

        machine.increaseBalls(1);
        checkMachine(machine, StateType.NOCOIN, 1);

        machine.insertCoin();
        machine.turnCrank();
        checkMachine(machine, StateType.SOLDOUT, 0);
    }

    private void checkMachine (GumballMachine machine, StateType type, int balls){
        machine.printMachine();
        assertEquals(type, machine.getState().getState());
        assertEquals(balls, machine.getBalls());
    }
}
