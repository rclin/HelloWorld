package ch1_tour.GenericType;

/**
 * Created by rilin on 12/7/2015.
 * generic interface
 */

public interface Lookup<T> {
    T find(String name);
}
