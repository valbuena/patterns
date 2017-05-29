package com.patterns.facade;

import com.patterns.facade.components.*;


public class HomeTheaterFacade {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Lights lights;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Lights lights, PopcornPopper popcornPopper, Projector projector, Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie (String movie){
        System.out.println(".....................");
        System.out.println("WATCHING A MOVIE ....");
        System.out.println(".....................");
        popcornPopper.on();
        popcornPopper.pop();
        screen.down();
        projector.on();
        projector.enabledWideScreenMode();
        dvdPlayer.on();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.enabledSurroundSound();
        amplifier.setVolume(5);
        lights.off();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println(".....................");
        System.out.println("SHUTTING MOVIE ......");
        System.out.println(".....................");
        lights.on();
        screen.up();
        popcornPopper.off();
        projector.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        amplifier.off();

    }
}
