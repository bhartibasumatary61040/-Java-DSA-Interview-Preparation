package org.java.designpattern.observer;
import java.util.ArrayList;
import java.util.List;
public class YouTubeChannel implements Subject{

    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {

        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {

        for (Observer observer : subscribers) {

            observer.update(message);
        }
    }

    public void uploadVideo(String title) {

        System.out.println("New Video Uploaded : " + title);

        notifyObservers(title);
    }
}
