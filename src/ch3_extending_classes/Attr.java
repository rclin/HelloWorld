package ch3_extending_classes;

/**
 * Created by Richard on 12/7/2015.
 */
public class Attr {

    private final String name;
    private Object value = null;

    public Attr(String name) {
        this.name = name;
    }

    public Attr(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public Object setValue(Object newValue) {
        Object oldVal = value;
        value = newValue;
        return oldVal;
    }

    public String toString() {
        return name + "='" + value + "'";
    }

    public static void main(String[] args) {
        System.out.println("attr");

        Attr attr1 = new Attr("attr1");
        System.out.println(attr1);

        Attr attr2 = new Attr("attr2", "attr2_value");
        System.out.println(attr2);

        System.out.println(attr2.setValue("attr2_new_value"));
    }
}
