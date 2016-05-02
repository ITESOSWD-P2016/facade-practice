package com.iteso.facade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

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
import com.iteso.facade.interfaces.impl.Movie;
import com.iteso.facade.interfaces.impl.SonyBravia;
import com.iteso.facade.interfaces.impl.XBOX;


public class MovieFacadeTest{
	MovieFacade oMovieFacade;
	GameConsole xbox;
    GameController dualShock;
    Lights lights;
    Router linksys;
    SoundSystem bose;
    TV tv;
    VideoGame movie;
	
	@Before
	public void setUp(){
		xbox = new XBOX();
        dualShock = new DualShock();
        lights = new EcoLights();
        linksys = new Linksys();
        bose = new Bose();
        tv = new SonyBravia();
        movie = new Movie("Titanic");
        oMovieFacade = new MovieFacade(tv, xbox, dualShock, bose, linksys, lights);
	}
	
	@Test
    public void testConsoleWhenMovieIsPlaying(){
		oMovieFacade.playMovie(movie.getName());
        assertTrue(((XBOX) oMovieFacade.console).isEstatus());
    }
	
	@Test
    public void testControllerWhenMovieIsPlaying(){
		oMovieFacade.playMovie(movie.getName());
        assertTrue(((DualShock) oMovieFacade.controller).isEstatus());
    }
	
	@Test
    public void testLightsWhenMovieIsPlaying(){
		oMovieFacade.playMovie(movie.getName());
        assertFalse(((EcoLights) oMovieFacade.lights).isEstatus());
    }
	
	@Test
    public void testRouterWhenMovieIsPlaying(){
		oMovieFacade.playMovie(movie.getName());
        assertTrue(((Linksys) oMovieFacade.router).isEstatus());
    }
	
	@Test
    public void testSoundSystemWhenMovieIsPlaying(){
		oMovieFacade.playMovie(movie.getName());
		assertTrue(((Bose) oMovieFacade.soundSystem).isEstatus());
    }
	
	@Test
    public void testTVWhenMovieIsPlaying(){
		oMovieFacade.playMovie(movie.getName());
		assertTrue(((SonyBravia) oMovieFacade.tv).isEstatus());
    }
	
	@Test
    public void testMovieWhenMovieIsPlaying(){
		oMovieFacade.playMovie(movie.getName());
        assertEquals("Titanic", oMovieFacade.movie.getName());
    }
	
	//******//
	
	@Test
    public void testConsoleWhenMovieIsStopped(){
		oMovieFacade.playMovie(movie.getName());
		oMovieFacade.stopPlayingGame();
        assertFalse(((XBOX) oMovieFacade.console).isEstatus());
    }
	
	@Test
    public void testControllerWhenMovieIsStopped(){
		oMovieFacade.playMovie(movie.getName());
		oMovieFacade.stopPlayingGame();
        assertFalse(((DualShock) oMovieFacade.controller).isEstatus());
    }
	
	@Test
    public void testLightsWhenMovieIsStopped(){
		oMovieFacade.playMovie(movie.getName());
		oMovieFacade.stopPlayingGame();
        assertTrue(((EcoLights) oMovieFacade.lights).isEstatus());
    }
	
	@Test
    public void testRouterWhenMovieIsStopped(){
		oMovieFacade.playMovie(movie.getName());
		oMovieFacade.stopPlayingGame();
        assertFalse(((Linksys) oMovieFacade.router).isEstatus());
    }
	
	@Test
    public void testSoundSystemWhenMovieIsFalse(){
		oMovieFacade.playMovie(movie.getName());
		oMovieFacade.stopPlayingGame();
		assertFalse(((Bose) oMovieFacade.soundSystem).isEstatus());
    }
	
	@Test
    public void testTVWhenMovieIsStopped(){
		oMovieFacade.playMovie(movie.getName());
		oMovieFacade.stopPlayingGame();
		assertFalse(((SonyBravia) oMovieFacade.tv).isEstatus());
    }
	
	@Test
    public void testMovieWhenMovieIsStopped(){
		oMovieFacade.playMovie(movie.getName());
		oMovieFacade.stopPlayingGame();
        assertEquals("Titanic", oMovieFacade.movie.getName());
    }
	
	
}
