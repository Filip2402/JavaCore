package module5.offline.singlton;

/**
 * Created by PC on 28.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Phil");
        user.setConnetion(Connetion.getInstance());
        System.out.println(user.connetion);
    }

}
