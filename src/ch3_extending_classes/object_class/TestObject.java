package ch3_extending_classes.object_class;

/**
 * Created by rilin on 12/10/2015.
 */
public class TestObject {
    public static void main(String[] args) {

        System.out.println("testing object");

        Integer n = new Integer("20");
        Integer m = new Integer("30");
        Integer o = n;

        System.out.println(n);
        System.out.println(n.hashCode());

        if (n.equals(m)) {
            System.out.println("n equals m");
        } else {
            System.out.println("n does not equal m");
        }

        if (n.equals(o)) {
            System.out.println("n equals o");
        } else {
            System.out.println("n does not equal o");
        }

    }
}
