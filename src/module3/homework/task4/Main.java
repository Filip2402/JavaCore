package module3.homework.task4;

/**
 * Created by PC on 26.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Phil",5000,3,"Pride",2000,"Dollars");

        System.out.println("Company Name Length = "+user.companyNameLength());
        System.out.println("================================");
        System.out.println("Balanse = "+user.getBalance());
        user.paySalary();
        System.out.println("Balanse after pay salary = "+user.getBalance());
        System.out.println("========================================");
        System.out.println("Month of enmployment = "+user.getMonthsOfEmployment());
        user.monthIncreaser(4);
        System.out.println("Increaser month of employment = "+user.getMonthsOfEmployment());
        System.out.println("==========================================");
        user.withdraw(1100);
        System.out.println("Balanse after withdraw 1100 = " + user.getBalance());
        user.withdraw(900);
        System.out.println("Balanse after withdraw 900 = " + user.getBalance());
    }
}
