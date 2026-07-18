package org.java.designpattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {

        System.out.println("Playing VLC File : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Do Nothing
    }
}
