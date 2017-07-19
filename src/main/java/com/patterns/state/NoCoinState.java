package com.patterns.state;

public class NoCoinState implements State {

    @Override
    public StateType getState() {
        return StateType.NOCOIN;
    }
    @Override
    public StateType insertCoin() {
        System.out.println("NoCoinState - GREAT!! - Your coin has been inserted");
        return StateType.COIN;
    }

    @Override
    public StateType ejectCoin() {
        System.out.println("NoCoinState - ERROR!! -  You didn't insert coins");
        return getState();
    }

    @Override
    public StateType turnCrank() {
        System.out.println("NoCoinState - ERROR!! -  You didn't insert coins");
        return getState();
    }

    @Override
    public StateType dispense() {
        System.out.println("NoCoinState - ERROR!! -  You didn't insert coins");
        return getState();
    }
}
