package ch3_extending_classes;

/**
 * Created by rilin on 12/9/2015.
 */
public class ExtendShow extends SuperShow {

    public String str = "ExtendStr";

    public void show() {
        System.out.println("Extend.show: " + str);
    }

    public static void main(String[] args) {

        ExtendShow ext = new ExtendShow();
        SuperShow sup = ext;

        sup.show(); // should call ExtendShow.show();
        ext.show(); // should call ExtendShow.show();

        System.out.println("sup.str = " + sup.str); // should print SuperShow str
        System.out.println("ext.str = " + ext.str); // should print ExtendShow str
    }

}
