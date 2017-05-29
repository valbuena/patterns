package com.patterns.facade.components;


public class PopcornPopper {

    private Enum state;

    public enum State {
        ON, OFF, POP
    }

    public void on(){
        System.out.println("Popcorn Popper ON");
        this.state = State.ON;
    }

    public void pop(){
        System.out.println("Popcorn Popper POP");
        this.state = State.POP;
    }

    public void off(){
        System.out.println("Popcorn Popper OFF");
        this.state = State.OFF;
    }
}
