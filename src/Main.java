import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, password, balance to create account");

        //create USER
        String name = sc.nextLine();gt
        String password = sc.nextLine();
        double balance = sc.nextDouble();
        SBIuser user = new SBIuser(name,balance,password);

        //ADD AMOUNT
        String message = user.addMoney(100000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter your secret password");
        String pass = sc.nextLine();
        System.out.println(user.withdrawMoney(money,pass));

        //rate of interest
        System.out.println(user.calculateInterest(10));
        }
}