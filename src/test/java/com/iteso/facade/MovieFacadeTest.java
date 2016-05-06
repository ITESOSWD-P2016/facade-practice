package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



/**
 * Created by alexabeas on 5/5/16.
 */
public class MovieFacadeTest {
    TV sonybravia;
    GameConsole ps3;
    GameController dualshock;
    SoundSystem bose;
    Router linksys;
    Lights ecolight;
    VideoGame movie;
    MovieFacade mfacade;

    @Before
    public void setUp() {
        sonybravia = new SonyBravia();
        ps3 = new PS3();
        dualshock = new DualShock();
        bose = new Bose();
        linksys = new Linksys();
        ecolight = new EcoLights();
        movie = new PS3Game("The Notebook");
        mfacade= new MovieFacade(sonybravia,ps3,dualshock,bose,linksys,ecolight);

    }

    @Test
    public void testTVwhenMovieIsPlaying(){
        mfacade.playMovie(movie.getName());
        assertEquals("Sony Bravia is ON", sonybravia.getStatus());
    }

    @Test
    public void testgameConsolewhenMovieIsPlaying(){
        mfacade.playMovie(movie.getName());
        assertEquals("Play Station 3 is ON", ps3.getStatus());
    }

    @Test
    public void testgameControllerwhenMovieIsPlaying(){
        mfacade.playMovie(movie.getName());
        assertEquals("DualShock wireless controller is ON", dualshock.getStatus());
    }

    @Test
    public void testSoundSystemwhenMovieIsPlaying(){
        mfacade.playMovie(movie.getName());
        assertEquals("Bose Surround System is ON", bose.getStatus());
    }

    @Test
    public void testRouterwhenMovieIsPlaying(){
        mfacade.playMovie(movie.getName());
        assertEquals("Linksys router is ON", linksys.getStatus());
    }

    @Test
    public void testLightswhenMovieIsPlaying(){
        mfacade.playMovie(movie.getName());
        assertEquals("EcoLights are OFF", ecolight.getStatus());
    }

}
