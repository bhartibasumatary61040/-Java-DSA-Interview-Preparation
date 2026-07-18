package org.java.systemDesign.ParkingLot;

public class Main {
    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot(5);

        Vehicle car1 = new Car("MH12AB1234");
        Vehicle bike1 = new Bike("MH14XY2222");
        Vehicle truck1 = new Truck("MH43TR5555");

        lot.park(car1);

        lot.park(bike1);

        lot.park(truck1);

        lot.display();

        lot.remove("MH14XY2222");

        lot.display();
    }
}
