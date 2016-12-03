package Module3.Homework;

/**
 * Created by PC on 03.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();

        System.out.println(bird.sing("walking"));
        System.out.println(bird.sing("flying"));
        System.out.println(bird.sing("singing"));
        System.out.println(bird.sing("Bird"));
    }
}
