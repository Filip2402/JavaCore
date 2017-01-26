package module3.offlile;

/**
 * Created by PC on 14.11.2016.
 */
public class Main {
    public static void main(String[] args) {
      Convert con = new Convert(26.1);

        double dollarsAmount = con.convert(1000);

        System.out.println(dollarsAmount);

        //////////////////////////////////////////

      Triangle triangle =new Triangle(1,2,10,4,5,7);
        triangle.print();
    }


}
