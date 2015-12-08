package ch1_tour.ExceptionSample;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by rilin on 12/7/2015.
 */
public class MyUtilities {
    // sample try-catch-finally sequence
    // BadDatasetExample is an example of a checked exception
    // unchecked exceptions include RuntimeException, Error or subclasses of these types
    public double[] getDataSet(String setname) throws BadDataSetException {


        String file = setname + ".dset";
        FileInputStream in = null;

        try {
            in = new FileInputStream(file);
            // return readDataSet(in);
        } catch (IOException e) {
            throw new BadDataSetException();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                // ignore; we either read the data OK
                // or we're throwing BadDataSetException
            }
        }

        return null;
    }
}
