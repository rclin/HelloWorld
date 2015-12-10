package ch3_extending_classes.fun_with_inheritance;

/**
 * Created by rilin on 12/10/2015.
 */
public class B extends A {

    public void printMe() {

        System.out.println("print class B");
    }

    public static void main(String[] args) {
        System.out.println("fun with inheritance");

        B bclass = new B();

        bclass.printMe();

        A aclass = bclass;

        aclass.printMe();

    }

}
