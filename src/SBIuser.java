import java.util.Objects;
import java.util.UUID;

public class SBIuser implements BankInterface{

    private final double rateOfInterest;
    //attributes need for any account holder in bank
    private String Name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfinterest;

    public SBIuser(String name, double balance, String password) {
        this.Name = name;
        this.balance = balance;
        this.password = password;

// BANK IS INITIALIZING

        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfinterest() {
        return rateOfinterest;
    }

    public void setRateOfinterest(double rateOfinterest) {
        this.rateOfinterest = rateOfinterest;
    }

    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "Your current new balance is" + balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
       if(Objects.equals(enteredPassword,password)){
           if(amount>balance){
               return "sorry insufficient Funds";
           }
           else{
               balance = balance-amount;
               return "thanks for visiting regards SBI";
           }
       }
       else{
           return "you entered a wrong password !";
       }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
