package ch3_extending_classes;

import ch3_extending_classes.X;

/**
 * Created by Richard on 12/8/2015.
 *
 * Notes:
 * 1) allocate memory for all fields
 * 2) invoke superclass constructor
 * 3) initialize fields using initializers/initialization blocks
 * 4) execute body of constructor
 *
 *
 */
public class Y extends X {

    protected int yMask = 0xff00;

    public Y() {
        fullMask |= yMask;
    }
}
