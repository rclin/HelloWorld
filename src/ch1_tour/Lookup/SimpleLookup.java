package ch1_tour.Lookup;

/**
 * Created by rilin on 12/7/2015.
 */
public class SimpleLookup implements Lookup {

    private String[] names;
    private Object[] values;

    public Object find(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return values[i];
            }
        }
        return null; // not found

    }
}
