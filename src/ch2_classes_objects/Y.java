package ch2_classes_objects;

/**
 * Created by Richard on 12/8/2015.
 */
public class Y extends X {

    protected int yMask = 0xff00;

    public Y() {
        fullMask |= yMask;
    }
}
