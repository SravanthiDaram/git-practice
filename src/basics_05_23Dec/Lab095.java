package basics_05_23Dec;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        // some of the digit ex: 5+4+3+2+1;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        long a = 0;

        for (int i = 1; i <=number ; i++) {
            a=a+i;

        }System.out.println("Some of a number is " +a);
        sc.close();

    }
}
