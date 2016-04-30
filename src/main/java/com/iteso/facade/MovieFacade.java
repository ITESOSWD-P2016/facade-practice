package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.PS3Game;

/**
 * Created by alexabeas on 4/29/16.
 */
public class MovieFacade {
    TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    VideoGame game;

    public MovieFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights){
        this.tv = tv;
        this.console = console;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
    }

    public void playMovie(String movieName){
        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        tv.on();
        tv.toHDMI();

        console.on();
        controller.on();
        game = new PS3Game(movieName);
        console.insertGame(game);

        soundSystem.on();
        soundSystem.toOpticalEntry();

        router.on();
        router.checkInternet();

        lights.off();

        game.setOnlineMode();
        game.play();
        System.out.println();

    }

    public void stopPlayingMovie(){

        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        lights.on();
        tv.off();
        controller.off();
        console.off();
        soundSystem.off();
        router.off();


    }
}
