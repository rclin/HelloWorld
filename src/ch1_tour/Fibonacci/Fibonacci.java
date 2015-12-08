package ch1_tour.Fibonacci;

/**
 * Created by rilin on 12/4/2015.
 */
public class Fibonacci {

    public static void printFibonnaci() {

        int lo = 1;
        int hi = 1;

        System.out.println(lo);

        while (hi < 50) {
            System.out.println(hi);
            hi = lo + hi;
            lo = hi - lo;
        }
    }

}
