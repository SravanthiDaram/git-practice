package Assignments;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        //Program for Multiplication table

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for the multiplication table");
        int num = sc.nextInt();
        System.out.println("Enter a range");
        int range = sc.nextInt();

        for(int i = 1; i<=range; i++){
            int result = num*i;
            System.out.println(num + "*" + i +"=" + result);
        }

    }
}
