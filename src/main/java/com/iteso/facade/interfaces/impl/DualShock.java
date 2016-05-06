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

    private String status;

    public String getStatus(){
        return status;
    }

    public void on() {
        System.out.println("DualShock wireless controller is ON");
        status="DualShock wireless controller is ON";
    }


    public void off() {
        System.out.println("DualShock wireless controller is OFF");
        status="DualShock wireless controller is OFF";
    }
}
