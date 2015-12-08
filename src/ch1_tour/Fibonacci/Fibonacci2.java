package ch1_tour.Fibonacci;

/**
 * Created by rilin on 12/4/2015.
 */
public class Fibonacci2 {

    static final int MAX = 50;

    public static void printFibonacci2() {

        int lo = 1;
        int hi = 1;

        System.out.println(lo);

        while (hi < MAX) {
            System.out.println(hi);
            hi = lo + hi;
            lo = hi - lo;
        }

    }
}
