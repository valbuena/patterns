package com.patterns.state;

public class SoldState implements State {

    @Override
    public StateType getState() {
        return StateType.SOLD;
    }

    @Override
    public StateType insertCoin() {
        System.out.println("SoldState - ERROR!! -  We already gave you a ball");
        return getState();
    }

    @Override
    public StateType ejectCoin() {
        System.out.println("SoldState - ERROR!! -  You already turned crank");
        return getState();
    }

    @Override
    public StateType turnCrank() {
        System.out.println("SoldState - ERROR!! -  You already turned crank");
        return getState();
    }

    @Override
    public StateType dispense() {
        System.out.println("SoldState - GREAT!! -  Here it is your ball!!!");
        return StateType.NOCOIN;
    }

}
