package basics_03;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        //int  a = 39;

        Scanner sc = new Scanner(System.in); // This is the syntax for user to enter a number 
        
        int a = sc.nextInt();
    
        if (a%2 == 1){

            System.out.println("Odd number");

        }else{
            System.out.println("Even number");
        }
    }
    
}
