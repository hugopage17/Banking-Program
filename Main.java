import java.awt.*;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hourly Rate: ");
        Scanner hourlyRate = new Scanner(System.in);

        System.out.println("Hours worked: ");
        Scanner hoursWorked = new Scanner(System.in);

        Calculation calc = new Calculation(hourlyRate.nextInt(), hoursWorked.nextInt(),0);

        calc.NetPaye();
        calc.Deposit(0);

        System.out.print("How many weeks do you want to save: ");
        Scanner weeks = new Scanner(System.in);
        Savings save = new Savings(weeks.nextInt(), calc.finalValue);
        save.Multiply();

        System.out.print("How many years: ");
        Scanner years = new Scanner(System.in);
        Salary salary = new Salary(8, 250, calc.hourlyRate, years.nextInt());
        salary.Convert();
        salary.PayBracket();

    }
}
