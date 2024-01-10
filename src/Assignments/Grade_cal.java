package Assignments;

import java.util.Scanner;

public class Grade_cal {
    public static void main(String[] args) {
        // program for grade cal

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if(marks<=100 && marks>=90){
            System.out.println("your grade is A");
        }
        else if (marks<=89 && marks>=80 ){
            System.out.println("your grade is B");
        }
        else if( marks<=79 && marks>=70){
            System.out.println("your grade is c");
        }
        else if(marks<69 && marks>=60){
            System.out.println("your grade is D");
        }
        else {
            System.out.println("you are fail");

        }

    }
}
