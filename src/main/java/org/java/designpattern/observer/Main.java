package org.java.designpattern.observer;

public class Main {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Observer user1 = new Subscriber("Bharti");
        Observer user2 = new Subscriber("Rahul");
        Observer user3 = new Subscriber("Amit");

        channel.addObserver(user1);
        channel.addObserver(user2);
        channel.addObserver(user3);

        channel.uploadVideo("Java Design Pattern Tutorial");

        System.out.println();

        channel.removeObserver(user2);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
