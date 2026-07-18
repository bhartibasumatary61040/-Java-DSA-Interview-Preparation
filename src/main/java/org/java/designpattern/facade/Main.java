package org.java.designpattern.facade;

public class Main {
    public static void main(String[] args) {

        DVDPlayer dvd = new DVDPlayer();

        Projector projector = new Projector();

        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(dvd, projector, sound);

        homeTheater.watchMovie();

        homeTheater.endMovie();
    }
}
