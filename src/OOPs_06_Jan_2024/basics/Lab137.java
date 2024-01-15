package OOPs_06_Jan_2024.basics;

import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {

        //String builder ios not a thread safe
        //string buffer is a thread safe
        //Palindrome program using string builder

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string, I will check is a palindrome or not");
        String user_input = sc.next();

        boolean result = ispalindrome(user_input);
        if(result){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }

    }

    private static boolean ispalindrome(String userInput) {
        String original_string = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString();
        return original_string.equalsIgnoreCase(reverse_string);

    }
}
