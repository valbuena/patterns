package com.patterns.facade.components;

public class DvdPlayer {

    private String movie;
    private Enum state;

    public enum State {
        ON, PLAY, STOP, EJECT, OFF
    }


    public void on(){
        System.out.println("DvdPlayer ON");
        this.state = State.ON;
    }

    public void stop(){
        System.out.println("DvdPlayer STOP");
        this.state = State.STOP;
    }

    public void off(){
        System.out.println("DvdPlayer OFF");
        this.state = State.OFF;
    }

    public void eject(){
        System.out.println("DvdPlayer EJECT");
        this.state = State.EJECT;
    }

    public void play(String movie){
        System.out.println("DvdPlayer PLAY " + movie);
        this.state = State.PLAY;
        this.movie = movie;
    }
}
