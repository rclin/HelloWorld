package ch3_extending_classes;

/**
 * Created by Richard on 12/7/2015.
 */
public class ColorAttr extends Attr {

    private ScreenColor myColor;

    public ColorAttr(String name, Object value) {
        super(name, value);
        decodeColor();
    }

    public ColorAttr(String name) {
        this(name, "transparent");
    }

    public ColorAttr(String name, ScreenColor value) {
        super(name, value.toString());
        myColor = value;
    }

    public Object setValue(Object newValue) {
        // super's setvalue first
        Object retval = super.setValue(newValue);
        decodeColor();
        return retval;
    }

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
