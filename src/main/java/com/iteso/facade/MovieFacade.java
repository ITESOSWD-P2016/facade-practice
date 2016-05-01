package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.PS3Game;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieFacade {
    TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    VideoGame movie;

    public MovieFacade(TV tv,
                       GameConsole console,
                       GameController controller,
                       SoundSystem soundSystem,
                       Lights lights){
        this.tv = tv;
        this.console = console;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }


    public void playMovie(String MovieName){

        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        tv.on();
        tv.toHDMI();

        console.on();
        controller.on();
        movie = new PS3Game(MovieName);
        console.insertGame(movie);

        soundSystem.on();
        soundSystem.toOpticalEntry();


        lights.off();

        movie.play();
        System.out.println();


    }

    public void stopPlayingGame(){

        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        lights.on();
        tv.off();
        controller.off();
        console.off();
        soundSystem.off();


    }


}
