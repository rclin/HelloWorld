package ch1_tour.GenericType;

/**
 * Created by rilin on 12/7/2015.
 */
public class IntegerLookup implements Lookup<Integer> {

    private String[] names;
    private Integer[] values;

    public Integer find(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return values[i];
            }
        }
        return null; // not found
    }
}
