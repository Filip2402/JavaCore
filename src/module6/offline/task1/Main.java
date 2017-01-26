package module6.offline.task1;

import java.util.*;

/**
 * Created by PC on 12.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 100; i++){
            userList.add(new User(GetRandomSurname(i),GetRandomName(i),i));
        }

        for (User user : userList) {
            System.out.println(user);
        }
        userList.sort(new NameAndSurnameComparator());

        System.out.println("=====================================");

        for (User user : userList) {
            System.out.println(user);
        }

    }

    private static String GetRandomName(int i){
        switch (i%3){
            case 0:
                return "Vania";
            case 1:
                return "Petia";
            case 2:
                return "Kolia";
            default:
                return "Olia";
        }

    }

    private static String GetRandomSurname(int i){
        switch (i%3){
            case 0:
                return "Petrov";
            case 1:
                return "Ivanov";
            case 2:
                return "Ivanov";
            default:
                return "Petrov";
        }

    }

}
