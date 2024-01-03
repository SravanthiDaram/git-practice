package basics_o4_17Dec;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {

        // cube root of (x^2+y^2-|z|)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for x,y,z");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        double a = x^2;
        double b = y^2;
        double c = Math.abs(z);

        System.out.println(Math.cbrt(a+b-c));


    }
}
