package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameConsole;
import com.iteso.facade.interfaces.VideoGame;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */

public class XBOX implements GameConsole {

    public String status;
    public String getStatus(){
        return status;
    }

    public void on() {
        System.out.println("XBOX 360 is ON");
    }

    public void off() {
        System.out.println("XBOX 360 is OFF");
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into Play Station 3");
    }
}
