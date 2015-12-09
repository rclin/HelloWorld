package ch3_extending_classes.abstract_classes_methods;

/**
 * Created by rilin on 12/9/2015.
 * abstract classes provide only partial implementation
 */
abstract class Benchmark {
    abstract void benchmark();

    public final long repeat(int count) {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            benchmark();
        }
        return (System.nanoTime() - start);
    }
}
