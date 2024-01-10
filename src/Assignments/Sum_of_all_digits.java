package Assignments;

import java.util.Scanner;

public class Sum_of_all_digits {
    public static void main(String[] args) {
        //Program for sum of all digit
        //for Ex: 123 it should give 1+2+3 is 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        int sum = 0;

        while(num>0){
            int a = num%10;
            sum = sum+a;
            num =num/10;

        }
        System.out.println("The total sum of the num is " +sum);




    }
}
