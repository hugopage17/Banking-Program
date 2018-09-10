import java.util.Scanner;

public class Calculation {

    int hourlyRate;
    int hoursWorked;
    int finalValue;

    public Calculation(int hourlyRate, int hoursWorked, int finalValue)
    {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.finalValue = finalValue;
    }

    public void NetPaye()
    {
        this.finalValue = this.hourlyRate * this.hoursWorked;
        System.out.println("Your net pay is: " + this.finalValue);
    }

    public void Deposit(int accountBalance)
    {
        do{
            this.finalValue --;
            accountBalance ++;
        } while (this.finalValue > 0);
        System.out.println("Your pay has gone into your account");
        System.out.println("Account Balance: $" + accountBalance);
    }
}
