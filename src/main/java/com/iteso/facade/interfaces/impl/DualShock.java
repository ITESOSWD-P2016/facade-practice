package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameController;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class DualShock implements GameController {
    // Para realizar pruebas se crea este atributo y el método correspondiente
	private boolean estatus;
	
    public boolean isEstatus() {
		return estatus;
	}

    public void on() {
        System.out.println("DualShock wireless controller is ON");
        this.estatus = true;
    }

    public void off() {
        System.out.println("DualShock wireless controller is OFF");
        this.estatus = false;
    }
}
