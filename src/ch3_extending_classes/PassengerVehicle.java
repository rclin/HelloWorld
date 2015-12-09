package ch3_extending_classes;

import ch2_classes_objects.Vehicle;

/**
 * Created by Richard on 12/8/2015.
 */
public class PassengerVehicle extends Vehicle {

    private int nSeats;
    private int nSeatsOccupied;

    PassengerVehicle(int nSeats) {
        this.nSeats = nSeats;
    }


    public static void main(String[] args) {
        System.out.println("passenger vehicle test");

        PassengerVehicle ph1 = new PassengerVehicle(5);
        ph1.setOwner("Michelle");
        System.out.println(ph1);

        // can't do this; constructors are not methods and therefore not inherited
//        PassengerVehicle ph2 = new PassengerVehicle("bob");

    }
}
