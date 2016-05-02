package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.SoundSystem;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bose implements SoundSystem {
    // Para realizar pruebas se crea este atributo y el método correspondiente
	private boolean estatus;
	
    public boolean isEstatus() {
		return estatus;
	}

    public void on() {
        System.out.println("Bose Surround System is turning ON");
        System.out.println("Bose Surround System is ON");
        this.estatus = true;
    }

    public void off() {
        System.out.println("Bose Surround System is turning OFF");
        System.out.println("Bose Surround System is OFF");
        this.estatus = false;

    }

    public void toOpticalEntry() {
        System.out.println("Changing Bose input to Optical");
    }
}
