package org.java.designpattern.facade;

public class SoundSystem {

    public void on() {

        System.out.println("Sound System ON");
    }

    public void setVolume(int volume) {

        System.out.println("Volume Set to " + volume);
    }

    public void off() {

        System.out.println("Sound System OFF");
    }

}
