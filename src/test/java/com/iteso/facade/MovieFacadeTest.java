package com.iteso.facade;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.GameController;
import com.iteso.facade.interfaces.Lights;
import com.iteso.facade.interfaces.Router;
import com.iteso.facade.interfaces.SoundSystem;
import com.iteso.facade.interfaces.TV;
import com.iteso.facade.interfaces.VideoGame;
import com.iteso.facade.interfaces.impl.Bose;
import com.iteso.facade.interfaces.impl.DualShock;
import com.iteso.facade.interfaces.impl.EcoLights;
import com.iteso.facade.interfaces.impl.Linksys;
import com.iteso.facade.interfaces.impl.PS3;
import com.iteso.facade.interfaces.impl.PS3Game;
import com.iteso.facade.interfaces.impl.SonyBravia;
import com.iteso.facade.interfaces.impl.XBOX;

/**
 * Created by Sebastian on 05/05/16.
 */
public class MovieFacadeTest {
    MovieFacade movieFacade;
    GameConsole ps3;
    GameController dualShock;
    Lights lights;
    Router linksys;
    SoundSystem bose;
    TV tv;
    VideoGame movie;

    @Before
    public void setUp(){

        ps3 = new PS3();
        dualShock = new DualShock();
        lights = new EcoLights();
        linksys = new Linksys();
        bose = new Bose();
        tv = new SonyBravia();
        movie = new PS3Game ("Scarface");
        movieFacade = new MovieFacade(tv, ps3, dualShock, bose, linksys, lights);
    }


    @Test
    public void testTVWhenMovieIsPlaying(){
        movieFacade.playMovies(movie.getName());
        assertEquals("Sony Bravia is ON", tv.getStatus());
    }

    @Test
    public void testPS3WhenMovieIsPlaying() {
        movieFacade.playMovies(movie.getName());
        assertEquals("Play Station 3 is ON", ps3.getStatus());
    }

    @Test
    public void testBOSEWhenMovieIsPlaying() {
        movieFacade.playMovies(movie.getName());
        assertEquals("Bose Surround System is ON", bose.getStatus());
    }

    @Test
    public void testWhatMovieIsPlaying() {
        movieFacade.playMovies(movie.getName());
        assertEquals("Scarface", movie.getName());
    }
}
