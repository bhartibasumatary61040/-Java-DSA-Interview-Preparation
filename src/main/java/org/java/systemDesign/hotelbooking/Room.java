package org.java.systemDesign.hotelbooking;

public class Room {

    private int roomNumber;
    private String roomType;
    private boolean booked;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookRoom() {
        booked = true;
    }

    public void checkoutRoom() {
        booked = false;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " | " + roomType + " | "
                + (booked ? "Booked" : "Available");
    }
}
