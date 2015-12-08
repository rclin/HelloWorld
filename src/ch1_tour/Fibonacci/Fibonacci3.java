package ch1_tour.Fibonacci;

/**
 * Created by rilin on 12/7/2015.
 * uses array
 * f0 = 1;
 * f1 = 1;
 * fn = fn-1 + fn-2;
 */

public class Fibonacci3 {

    static final int MAX_ARRAY = 100;
    static final int MAX = 50;

    public static void printFibonacci3() {


        int[] seq = new int[MAX_ARRAY];

        // f0
        seq[0] = 1;

        // f1
        seq[1] = 1;

        int n = 2;
        int result;
        while ((result = seq[n-1] + seq[n-2]) < MAX) {

            seq[n] = result;
            n++;

        }
       seq[n] = -1;

        int i = 0;
        while (seq[i] != -1) {
            System.out.println(seq[i++]);
        }





    }
}
