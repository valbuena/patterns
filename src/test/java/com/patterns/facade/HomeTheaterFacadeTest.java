package com.patterns.facade;

import com.patterns.facade.components.*;
import org.junit.Test;


public class HomeTheaterFacadeTest {

    private HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
            new Amplifier(), new DvdPlayer(), new Lights(), new PopcornPopper(), new Projector(), new Screen());


    @Test
    public void testHomeTheater (){
        homeTheaterFacade.watchMovie("Toy Story");
        homeTheaterFacade.endMovie();
    }
}
