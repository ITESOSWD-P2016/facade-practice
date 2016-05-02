package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Lights;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class EcoLights implements Lights {
    // Para realizar pruebas se crea este atributo y el método correspondiente
	private boolean estatus;
	
    public boolean isEstatus() {
		return estatus;
	}

    public void on() {
        System.out.println("EcoLights are ON");
        this.estatus = true;
    }

    public void off() {
        System.out.println("EcoLights are OFF");
        this.estatus = false;
    }
}
