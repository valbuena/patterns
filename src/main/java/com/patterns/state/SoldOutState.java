package com.patterns.state;

public class SoldOutState implements State {

    @Override
    public StateType getState() {
        return StateType.SOLDOUT;
    }

    @Override
    public StateType insertCoin() {
        return soldOut();
    }

    @Override
    public StateType ejectCoin() {
        return soldOut();
    }

    @Override
    public StateType turnCrank() {
        return soldOut();
    }

    @Override
    public StateType dispense() {
        return soldOut();
    }

    private StateType soldOut(){
        System.out.println("SoldOutState - ERROR!! -  We don't have any balls");
        return getState();
    }
}
