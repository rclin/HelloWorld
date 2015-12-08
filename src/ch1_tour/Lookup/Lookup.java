package ch1_tour.Lookup;

/**
 * Created by rilin on 12/7/2015.
 */
interface Lookup {
    /* Return the value associated with the name, or
     * null if there is no such value
     */
    Object find(String name);
}
