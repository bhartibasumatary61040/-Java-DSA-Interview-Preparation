package org.java.systemDesign.hotelbooking;
import java.util.ArrayList;
import java.util.List;
public class Hotel {

    List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {

        rooms.add(room);

        System.out.println("Room " + room.getRoomNumber() + " Added");
    }

    public void bookRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (!room.isBooked()) {

                    room.bookRoom();

                    System.out.println("Room " + roomNumber + " Booked Successfully");

                } else {

                    System.out.println("Room Already Booked");
                }

                return;
            }
        }

        System.out.println("Room Not Found");
    }

    public void checkout(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (room.isBooked()) {

                    room.checkoutRoom();

                    System.out.println("Checkout Successful");

                } else {

                    System.out.println("Room Already Available");
                }

                return;
            }
        }

        System.out.println("Room Not Found");
    }

    public void displayRooms() {

        System.out.println("\nHotel Rooms");

        for (Room room : rooms) {

            System.out.println(room);
        }
    }
}
