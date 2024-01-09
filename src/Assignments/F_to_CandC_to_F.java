package Assignments;

import java.util.Scanner;

public class F_to_CandC_to_F {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature");
        double f = sc.nextDouble();
        double Celsius = (((f-32)*5)/9);
        System.out.println("The Celsius temperature is " + Celsius);

        System.out.println("Enter Celsius temperature");
        double c = sc.nextDouble();
        double fahrenheit = ((c*9)/5)+32;
        System.out.println("The Fahrenheit temperature is " + fahrenheit);



    }
}
