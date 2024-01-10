package OOPs_07_30Dec;

import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args) {
        //Swapping 2 number without temp variable

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a");
        int a = sc.nextInt();
        System.out.println("Enter the value b");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The valaues for a,b is " +a +" , "+b);


    }
}
