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

    private String status;

    public String getStatus(){
        return status;
    }

    public void on() {
        System.out.println("Bose Surround System is turning ON");
        System.out.println("Bose Surround System is ON");
        status="Bose Surround System is ON";
    }


    public void off() {
        System.out.println("Bose Surround System is turning OFF");
        System.out.println("Bose Surround System is OFF");
        status="Bose Surround System is OFF";

    }


    public void toOpticalEntry() {
        System.out.println("Changing Bose input to Optical");
    }
}
