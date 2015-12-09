package ch2_classes_objects;

/**
 * Created by rilin on 12/7/2015.
 */
public class Vehicle {

    private String owner;
    private int currentSpeed;
    private int currentDirection;

    private static long nextID;

    private final long idNum;

    private final int immutableNumber = 2; // cannot be modified

    // accessible only by subclasses, classes in same package or class itself
    protected int protectedNumber;

    // initialization block, use judiciously, when code can't be expressed
    // easily by constructors alone
    // can throw checked exceptions if all constructors throw that exception
    {
        idNum = nextID++;
    }

    // static initialization block.  cannot throw checked exceptions
    static {
        nextID = 1;
    }

    public Vehicle(String owner) {
        this.owner = owner;
    }

    public static long getHighestID() {
        return nextID-1;
    }

    public String toString() {
        String desc = idNum + " (" + owner + ") speed: " + currentSpeed + " direction: " + currentDirection;
        return desc;
    }

    // access control is per-class

    // method overloading
    // two methods can have same name if their signatures are different

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getID() {
        return idNum;
    }

    public void changeSpeed(int speed) {
        this.currentDirection = currentSpeed;
    }

    public void stop() {
        this.currentSpeed = 0;
    }

    public void changeDirection(int direction) {
        this.currentDirection = direction;
    }
}
