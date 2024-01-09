package Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class F_to_Cwithcondition {
    public static void main(String[] args) {

        double f,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1. Fahrenheit to Celsius  \n 2. Celsius to Fahrenheit");
        int ch= sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Enter a Fahrenheit temperature");
                f=sc.nextDouble();
                c= ((f-32)*5)/9;
                System.out.println("Celsius temperature is" + c);
                break;
            case 2:
                System.out.println("Enter a Celsius temperature");
                c=sc.nextDouble();
                f = ((c*9)/5)+32;
                System.out.println("Fahrenheit temperature is " + f);
                break;

            default:
                System.out.println("Please choose a valid choice");

        }
    }
}
