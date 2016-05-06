package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.VideoGame;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class PS3Game implements VideoGame {
   public String name;
    public PS3Game(String name){
        this.name = name;
    }


    public void setOnlineMode() {
        System.out.println("Setting Online mode on " + name);
    }


    public void play() {
        System.out.println("Playing " + name);
    }


    public String getName() {
        return this.name;
    }
}
