package Module4.offline;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by PC on 21.11.2016.
 */
public class EngDictionary extends AbstractDao implements Dao {
    private String[] engArray = {"January","February","March","April","May","June","July","August","September","October","November","Desember",};

    @Override
    String[] getArray() {
        return engArray;
    }

    @Override
    String[] setArray(String[] array) {
        return engArray = array;
    }
}
