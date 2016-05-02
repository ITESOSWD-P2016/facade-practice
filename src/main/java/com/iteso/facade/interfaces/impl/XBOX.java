package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class XBOX implements GameConsole {
    // Para realizar pruebas se crea este atributo y el método correspondiente
	private boolean estatus;
	
    public boolean isEstatus() {
		return estatus;
	}

    public void on() {
        System.out.println("XBOX 360 is ON");
        this.estatus = true;
    }

    
    public void off() {
        System.out.println("XBOX 360 is OFF");
        this.estatus = false;
    }

    
    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into XBOX");
    }
}
