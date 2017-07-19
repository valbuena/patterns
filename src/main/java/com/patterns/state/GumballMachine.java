package com.patterns.state;

import java.util.Optional;

public class GumballMachine {

    private State state = StateFactory.createState(StateType.SOLDOUT).get();
    private int balls = 0;

    public GumballMachine(int balls) {
        increaseBalls(balls);
    }

    public State getState() {
        return state;
    }

    public int getBalls() {
        return balls;
    }

    public void printMachine (){
        System.out.println("-- Machine State: "+ this.state.getState() + "; balls: " + this.balls);
    }

    public void insertCoin (){
        setState(state.insertCoin());
    }

    public void  ejectCoin(){
        setState(state.ejectCoin());
    }

    public void turnCrank(){

        setState(state.turnCrank());
        StateType stateType =  state.dispense();
        if (isDifferentState(stateType)){
            setState(stateType);
            decreaseBalls();
        }
    }

    public void setState(StateType type) {
        if (isDifferentState(type)){
            Optional<State> state = StateFactory.createState(type);
            state.ifPresent(newState -> this.state = newState);
        }
    }

    public void increaseBalls(int balls) {
        if (balls > 0) {
            boolean isEmptyMachine = !isWithBalls();
            this.balls += balls;
            if (isEmptyMachine){
                setState(StateType.NOCOIN);
            }
        }
    }

    private void decreaseBalls() {
        this.balls -= 1;
        if (!isWithBalls()){
            setState(StateType.SOLDOUT);
        }
    }

    private boolean isDifferentState(StateType type){
        return !(this.state.getState() == type);
    }

    private boolean isWithBalls(){
        return this.balls > 0;
    }




}
