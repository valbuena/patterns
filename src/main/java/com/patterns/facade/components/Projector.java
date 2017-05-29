package com.patterns.facade.components;

public class Projector {

    private State state;
    private boolean wideScreenMode;

    public enum State {
        ON, OFF
    }

    public void on(){
        System.out.println("Projector ON");
        this.state = State.ON;
    }

    public void off(){
        System.out.println("Projector OFF");
        this.state = State.OFF;
    }

    public void enabledWideScreenMode() {
        this.wideScreenMode = true;
        System.out.println("Projector enabled wide screen mode");
    }
}
