package Module5.offline.singlton;

/**
 * Created by PC on 28.11.2016.
 */
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Connetion connetion;

    public void setConnetion(Connetion connetion) {
        this.connetion = connetion;
    }
}
