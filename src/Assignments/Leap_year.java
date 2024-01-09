package Assignments;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        // Finding leap year

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        double number = sc.nextDouble();

        if ((number % 4 == 0) && (number % 100!=0 || number % 400 == 0)){

            System.out.println("It's a leap year");
        }
        else
        {

            System.out.println("It's not a leap year");
        }
    }
}
