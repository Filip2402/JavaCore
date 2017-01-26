package module6.offline.task1;

import java.util.Comparator;

/**
 * Created by PC on 12.12.2016.
 */
public class NameAndSurnameComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.getSurname().compareTo(o2.getSurname())==0){

            return o1.getName().compareTo(o2.getName());
        }
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
