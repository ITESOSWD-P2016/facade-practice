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

    private String status;

    public String getStatus(){
        return status;
    }
    public void on() {
        System.out.println("EcoLights are ON");
        status="EcoLights are ON";
    }


    public void off() {
        System.out.println("EcoLights are OFF");
        status="EcoLights are OFF";
    }
}
