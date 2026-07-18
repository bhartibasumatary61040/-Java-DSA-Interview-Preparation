package org.java.designpattern.adapter;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {

            System.out.println("Playing MP3 File : " + fileName);

        } else if (audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("vlc")) {

            mediaAdapter = new MediaAdapter(audioType);

            mediaAdapter.play(audioType, fileName);

        } else {

            System.out.println("Invalid Media Format");
        }
    }
}
