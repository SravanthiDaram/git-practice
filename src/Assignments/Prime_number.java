package Assignments;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int a = 0;

        if(number == 0 || number == 1){

            System.out.println("It's not a prime number");
        }
        else {
            for (int i=2; i <= number / 2 ; i++ ){
                if(number%2==0){
                    a=1;
                    break;
                }
            }
        }if (a == 1){
            System.out.println("it's not a prime number");
        }
        else {
            System.out.println("it's a prime number");
        }

    }
}
