package basics_04_17Dec;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a triangle sides: side1, side2, side3");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1==side2) && (side2==side3)){
            System.out.println("It's a equilateral");

        }else if ( (side1==side2) || (side1==side3) || (side2==side3)){
            System.out.println("It's a Isosceles");
        }else
            System.out.println("It's a Scalene");


    }
}
