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
    private String status;

    public String getStatus(){
        return status;
    }

    public void on() {
        System.out.println("Linksys router is ON");
        status="Linksys router is ON";
    }


    public void off() {
        System.out.println("Linksys router is OFF");
        status="Linksys router is OFF";
    }


    public void checkInternet() {
        System.out.println("Checking internet connection");
        System.out.println("Internet connection is OK");
    }
}
