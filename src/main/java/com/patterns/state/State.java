package com.patterns.state;

public interface State {

    public StateType getState();
    public StateType insertCoin();
    public StateType ejectCoin();
    public StateType turnCrank();
    public StateType dispense();


}
