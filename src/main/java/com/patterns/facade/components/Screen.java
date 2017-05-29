package com.patterns.facade.components;


public class Screen {

    private State state;

    public enum State {
        DOWN, UP
    }

    public void down(){
        System.out.println("Screen DOWN");
        this.state = State.DOWN;
    }

    public void up(){
        System.out.println("Screen UP");
        this.state = State.UP;
    }
}
