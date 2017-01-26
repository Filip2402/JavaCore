package module3.homework.task2;

/**
 * Created by PC on 04.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        System.out.println(a.add(2,3));

        Adder add = new Adder();
        System.out.println(add.add(3,4));
        System.out.println(add.chek(5,4));
    }
}
