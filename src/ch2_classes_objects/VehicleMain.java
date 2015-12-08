package ch2_classes_objects;

/**
 * Created by Richard on 12/7/2015.
 */
public class VehicleMain {

    public static void main(String[] args) {
        System.out.println("testing vehicle class");

        Vehicle v1 = new Vehicle();
        v1.setOwner("John Smith");
        v1.changeSpeed(20);
        v1.changeDirection(50);
        System.out.println("owner: " + v1.getOwner() + ", id: " + v1.getID());

        Vehicle v2 = new Vehicle();
        v2.setOwner("Jane Doe");
        System.out.println("owner: " + v2.getOwner() + ", id: " + v2.getID());

        System.out.println("highest ID used so far: " + Vehicle.getHighestID());

        Vehicle v3 = new Vehicle();
        v3.setOwner("Jim Bob");
        v3.changeSpeed(88);
        v3.changeDirection(45);
        System.out.println(v3);
    }
}
