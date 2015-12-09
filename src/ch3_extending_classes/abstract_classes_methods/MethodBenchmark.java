package ch3_extending_classes.abstract_classes_methods;

/**
 * Created by rilin on 12/9/2015.
 */
public class MethodBenchmark extends Benchmark {
    /** Do nothing, just return. */
    void benchmark() {

    }

    // subclasses can override methods from superclass and declare them abstract

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        long time = new MethodBenchmark().repeat(count);
        System.out.println(count + " methods in " +
                time + " nanoseconds");


    }
}
