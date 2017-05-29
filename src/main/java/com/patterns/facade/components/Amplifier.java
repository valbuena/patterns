package com.patterns.facade.components;


public class Amplifier {

    private State state;
    private int volume;
    private DvdPlayer dvd;
    private boolean surroundSound;


    public enum State {
        ON, OFF
    }

    public void on(){
        System.out.println("Amplifier ON");
        this.state = State.ON;
    }

    public void off(){
        System.out.println("Amplifier OFF");
        this.state = State.OFF;
    }

    public void setDvd (DvdPlayer dvd){
        this.dvd = dvd;
        System.out.println("Amplifier setting DvdPlayer");

    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier setting volume " + volume);
    }

    public void enabledSurroundSound() {
        this.surroundSound = true;
        System.out.println("Amplifier enabled surround sound");
    }
}
