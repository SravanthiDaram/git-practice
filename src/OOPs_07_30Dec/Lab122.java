package OOPs_07_30Dec;

import java.util.Scanner;

public class Lab122 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value a");
            int a = sc.nextInt();
            System.out.println("Enter the value b");
            int b = sc.nextInt();

            a = a * b;
            b = a / b;
            a = a / b;

            System.out.println("The values for a,b is " + a + "," + b);
        }
        catch (Exception e){
            System.out.println("not possible with zero");

        }


    }
}
