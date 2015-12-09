package ch2_classes_objects;

/**
 * Created by Richard on 12/8/2015.
 */
public class X {

    protected int xMask = 0x00ff;
    protected int fullMask;

    public X() {
        fullMask = xMask;
    }

    public int mask(int orig) {
        return (orig & fullMask);
    }
}
