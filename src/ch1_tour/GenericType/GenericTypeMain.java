package ch1_tour.GenericType;

/**
 * Created by rilin on 12/7/2015.
 */
public class GenericTypeMain {

    //void processValues(String[] names, Lookup<Object> table) {
//    void processValues(String[] names, Lookup<?> table) {
    void processValues(String[] names, Lookup<? extends Number> table) {
        for (int i=0; i<names.length; i++) {
            //Object value = table.find(names[i]);
            Number value = table.find(names[i]);
            if (value != null) {
                // processValue(names[i], value);
            }
        }
    }

    public void runGenericTypeMain() {

        Lookup<Integer> table = new IntegerLookup();
        // ... add entries to table ...
        String[] names = {"One,", "two"};

        // not valid since Lookup<Integer> is not a subtype of Lookup<Object>
        // so we change processValues method signature to use wildcard (aka unbounded wildcard(
        // If we want to allow only Integer, Long or Double, etc.. all subclasses of
        // Number, then we restrict by using <? extends Number> (aka bounded wildcard)
        processValues(names, table);
    }
}
