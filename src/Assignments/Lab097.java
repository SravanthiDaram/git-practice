package Assignments;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {
        // factorial of a number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int fact = 1;

        for (int i=1; i<=number; i++){

            fact = fact*i;

        }
        System.out.println("factorial of a number" + number + "is" +fact);

    }
}