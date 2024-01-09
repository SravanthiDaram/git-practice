package basics_06_24Dec;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

        // take the input from user for 5 subjects of marks and print the marks

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Please enter the marks for math");
        marks[0] = sc.nextInt();
        System.out.println("Please enter the marks for english");
        marks[1]= sc.nextInt();
        System.out.println("Please enter the marks for science");
        marks[2] = sc.nextInt();
        System.out.println("Please enter the marks for social");
        marks[3]=sc.nextInt();
        System.out.println("please enter the marks for hindi");
        marks[4]=sc.nextInt();

        for (int i = 0; i < marks.length ; i++) {

            if(marks[i] <30){

                System.out.println("you fail in this subject");
            }

            System.out.println("The list of marks" + marks[i]);


        }
        sc.close();

    }
}
