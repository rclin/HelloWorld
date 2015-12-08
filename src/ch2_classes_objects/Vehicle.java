package ch2_classes_objects;

/**
 * Created by rilin on 12/7/2015.
 */
public class Vehicle {

    public String owner;
    public int currentSpeed;
    public int currentDirection;

    public static long nextID;

    public int ID;

    private final int immutableNumber = 2; // cannot be modified

    // accessible only by subclasses, classes in same package or class itself
    protected int protectedNumber;

    public static void main(String[] args) {
        System.out.println("testing vehicle class");

        Vehicle v1 = new Vehicle();
        v1.owner = "John Smith";
        v1.currentDirection = 50;
        v1.currentSpeed = 20;
        System.out.println("owner: " + v1.owner);
    }

}
