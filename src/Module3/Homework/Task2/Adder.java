package module3.homework.task2;

/**
 * Created by PC on 04.12.2016.
 */
public class Adder extends Arithmetic{

    public boolean chek(Integer a,Integer b){
        boolean flag = false;
        if (a >= b){
            flag = true;
        }
        return flag;
    }
}
