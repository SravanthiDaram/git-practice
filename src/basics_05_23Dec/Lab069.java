package basics_05_23Dec;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab069 {

    public static void main(String[] args) {

        Scanner user_details = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_details.next();

        System.out.println("Enter your age");
        int age = user_details.nextInt();

        System.out.println("Enter your salary");
        double salary = user_details.nextDouble();

        System.out.println("your details are " + name + " " +age +" " + salary);
        user_details.close();



    }
}
