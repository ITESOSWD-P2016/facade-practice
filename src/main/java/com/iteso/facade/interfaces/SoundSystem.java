package com.iteso.facade.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SoundSystem {
    void on();
    void off();
    void toOpticalEntry();
    String getStatus();
}
