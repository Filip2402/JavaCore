package module4.offline;

/**
 * Created by PC on 21.11.2016.
 */
public interface Dao{

    boolean addWord(String word);
    boolean updateWord(String str, String dest);
    boolean delete(String deleteWord);
    String[] getList();
}
