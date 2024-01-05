package basics_05_23Dec;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int fact =1;

        for (int i = 1; i <= number ; i++) {

            fact = fact*i;
        }
        System.out.println("Factorial of a number "+ number+ " " +"is"+ " " + fact);
        sc.close();
    }

}

