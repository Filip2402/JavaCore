package Module5.offline.singlton;

/**
 * Created by PC on 28.11.2016.
 */
public class Connetion {
    private String url = "http://SomeSite";
    private static Connetion instance = new Connetion();


    public static Connetion getInstance() {
        return instance;
    }

    public static void setInstance(Connetion instance) {
        Connetion.instance = instance;
    }
}
