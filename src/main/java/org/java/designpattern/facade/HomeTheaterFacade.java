package org.java.designpattern.facade;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer,
                             Projector projector,
                             SoundSystem soundSystem) {

        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {

        System.out.println("Starting Home Theater...\n");

        projector.on();

        soundSystem.on();
        soundSystem.setVolume(20);

        dvdPlayer.on();
        dvdPlayer.playMovie();
    }

    public void endMovie() {

        System.out.println("\nShutting Down Home Theater...\n");

        dvdPlayer.off();
        soundSystem.off();
        projector.off();
    }
}
