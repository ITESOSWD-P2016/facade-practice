package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.VideoGame;

public class Movie implements VideoGame {
    String name;
    
    public Movie(String name){
        this.name = name;
    }

    public void setOnlineMode() {
        System.out.println("I don't know if it's possible but we are setting Online mode on " + name);
    }

    public void play() {
        System.out.println("Playing " + name);
    }

    public String getName() {
        return this.name;
    }
}
