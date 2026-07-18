package org.java.systemDesign.hotelbooking;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.addRoom(new Room(101, "Single"));
        hotel.addRoom(new Room(102, "Double"));
        hotel.addRoom(new Room(103, "Suite"));

        hotel.displayRooms();

        hotel.bookRoom(102);

        hotel.displayRooms();

        hotel.checkout(102);

        hotel.displayRooms();
    }

}
