package ch3_extending_classes;

/**
 * Created by Richard on 12/7/2015.
 */
public class ColorAttr extends Attr {

    private ScreenColor myColor;

    public ColorAttr(String name, Object value) {
        // superclass constructor invocation
        super(name, value);

        // call this to populate myColor
        decodeColor();
    }

    public ColorAttr(String name) {
        this(name, "transparent");
    }

    public ColorAttr(String name, ScreenColor value) {
        super(name, value.toString());
        myColor = value;
    }

    // superclass no-arg constructor is called if
    // no constructors are called in new constructor
    // if no-arg constructor not available, then need
    // to call another constructor, which is why following
    // constructor is not valid
//    public ColorAttr(String name, Object value, Object extraParam)
//    }

    // overriding superclass setvalue method
    // there are rules for changing the return type
    // in an overriding method
    public Object setValue(Object newValue) {
        // super's setvalue first
        Object retval = super.setValue(newValue);
        decodeColor();
        return retval;
    }

    // overloading setvalue method
    // by having different arguments
    public ScreenColor setValue(ScreenColor newValue) {
        // super's setvalue first
        super.setValue(newValue.toString());
        ScreenColor oldValue = myColor;
        myColor = newValue;
        return oldValue;
    }

    protected void decodeColor() {
        if (getValue() == null) {
            myColor = null;
        } else {
            myColor = new ScreenColor(getValue());
        }
    }
}
