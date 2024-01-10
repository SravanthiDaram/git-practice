package OOPs_07_30Dec;

import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {
        // Swapping 2 numbers
        //ex: a = 12, b=13
        // the swap should give a= 13,b=12
        // code using temp variable

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a");
        int a = sc.nextInt();
        System.out.println("Enter the value b");
        int b = sc.nextInt();

        int temp = a ;
        a=b;
        b=temp;

        System.out.println("The values of a,b is " +a +" , "+b);
    }
}
