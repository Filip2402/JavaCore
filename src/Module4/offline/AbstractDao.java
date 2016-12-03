package Module4.offline;

import java.util.Arrays;

/**
 * Created by PC on 21.11.2016.
 */
public abstract class AbstractDao implements Dao {

    abstract String[] getArray();
    abstract String[] setArray(String[] array);

    @Override
    public boolean addWord(String word){
        setArray(Arrays.copyOf(getArray(),getArray().length+1)) ;
        getArray()[getArray().length-1] = word;

        return true;
    }

    @Override
    public boolean updateWord(String str, String dest){
        boolean isUpdate = false;

        for (int i=0;i<getArray().length;i++){

        }

        return isUpdate;
    }

    @Override
    public boolean delete(String deleteWord) {
        return false;
    }

    @Override
    public String[] getList() {
        return new String[0];
    }


}
