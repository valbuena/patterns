package com.patterns.facade.components;


public class Lights {

    private State state;
    private int dim;

    public enum State {
        ON, OFF
    }

    public void on(){
        System.out.println("Lights ON");
        this.state = State.ON;
    }

    public void off(){
        System.out.println("Lights OFF");
        this.state = State.OFF;
    }

    public void dim(int dim) {
        this.dim = dim;
        System.out.println("Lights setting dim " + dim);
    }
}
