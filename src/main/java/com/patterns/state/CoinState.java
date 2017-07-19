package com.patterns.state;

public class CoinState implements State {

    @Override
    public StateType getState() {
        return StateType.COIN;
    }

    @Override
    public StateType insertCoin() {
        System.out.println("CoinState - ERROR!! -  You have coins");
        return getState();
    }

    @Override
    public StateType ejectCoin() {
        System.out.println("CoinState - GREAT!! -  We'll return your coin");
        return StateType.NOCOIN;
    }

    @Override
    public StateType turnCrank() {
        System.out.println("CoinState - GREAT!! -  We are going to give you a ball");
        return StateType.SOLD;
    }

    @Override
    public StateType dispense() {
        System.out.println("CoinState - ERROR!! -  You have to turn crank");
        return getState();
    }
}
