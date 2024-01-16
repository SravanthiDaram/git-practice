package OOPs_07_Jan2024;

import java.util.Scanner;

public class Lab145 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name");
        String name = sc.next();

        Person p1 = new Person(name);
        p1.Printdetails();

        System.out.println("Enter your Second name");
        String name2 = sc.next();
        Person p2 = new Person(name2);
        p2.Printdetails();

        sc.close();

    }

}
