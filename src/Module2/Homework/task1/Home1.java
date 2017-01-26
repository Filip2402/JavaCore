package module2.homework.task1;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by PC on 01.11.2016.
 */
public class Home1 {
    public static void main(String[] args) {
        int size = 10;
        Random r = new Random(System.currentTimeMillis());
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            array[i] = r.nextInt(21) - 10;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("sum = "+sum(array));
        System.out.println("min = "+min(array));
        System.out.println("max = "+max(array));
        if (maxPositive(array) >0){
            System.out.println("maxPositive = "+maxPositive(array));
        } else {
            System.out.println("No positive elements");
        }
        System.out.println("multiplication = "+multiplication(array));
        if (array[9] != 0){
            System.out.println("moduluse first and last = "+modulus(array));
        }else {
            System.out.println("modulus error");
        }
        System.out.println("second lagest = "+secondLagets(array));
    }

    public static int sum(int array[]){
        int sum = 0;
        for(int i=0; i < 10; i++){
            sum += array[i];
        }

        return sum;
    }

    public  static int min(int array[]){
        int min = array[0];
        for (int i=1;i<10;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public  static int max(int array[]){
        int max = array[0];
        for (int i=1;i<10;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(int array[]){
        int max = array[0];
        for(int i=1; i < 10; i++){
            if ((array[i]>max)&&(array[i]>0)){
                max = array[i];
            }
        }

        return max;
    }

    public static int multiplication(int array[]){
        int mult = 1;
        for(int i=0; i < 10; i++){
            mult *= array[i];
        }

        return mult;
    }

    public  static int modulus(int array[]){
        return array[0]%array[9];
    }

    public  static int secondLagets(int array[]){
        int max = array[0];
        int secMax = array[1];
        if (secMax > max){
            int a = secMax;
            secMax = max;
            max = a;
        }

        for (int i=2;i<10;i++){
            int b = max;
            if (array[i] > max){
                max = array[i];
                secMax = b;
            }
            if ((array[i]>secMax)&&(array[i] < max)) {
                secMax = array[i];
            }
        }

        return secMax;
    }
}
