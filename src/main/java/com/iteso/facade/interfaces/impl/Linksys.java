package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Router;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Linksys implements Router {
    // Para realizar pruebas se crea este atributo y el método correspondiente
	private boolean estatus;
	
    public boolean isEstatus() {
		return estatus;
	}

    public void on() {
        System.out.println("Linksys router is ON");
        this.estatus = true;
    }

    public void off() {
        System.out.println("Linksys router is OFF");
        this.estatus = false;
    }

    public void checkInternet() {
        System.out.println("Checking internet connection");
        System.out.println("Internet connection is OK");
    }
}
