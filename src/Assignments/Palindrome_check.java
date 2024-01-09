package Assignments;

import java.util.Scanner;

public class Palindrome_check {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a string");
        String a = sc.next();

        int strlength = a.length();
        String Reverse = "";

        for ( int i=(strlength - 1); i>= 0; --i ){

            Reverse = Reverse + a.charAt(i);
        }

        if(Reverse.toLowerCase().equals(a.toLowerCase())){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
}
