package OOPs_07_30Dec;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {
        // how take a input from user for an array
        //1st we need to know what is the length of the array

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of the array");
        int n = sc.nextInt();
        int [] array_length = new int[n];

        System.out.println("Enter the values");
        for (int i = 0; i < n; i++) {
            array_length[i] = sc.nextInt();// to take the inputs from user
        }
        System.out.println("The output is");
        for (int i = 0; i < n; i++) {
            System.out.println(array_length[i]);

        }
        sc.close();



    }
}
