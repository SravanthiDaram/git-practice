package basics_04_17Dec;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();

        if( score >=90 && score <= 100){
            System.out.println("It's Grade A");
        } else if (score >=80 && score<=89) {
            System.out.println("It's Grade B");
            
        } else if (score >= 70 && score <= 79) {
            System.out.println("It's Grade C");
            
        } else if (score >= 60 && score <= 69) {
            System.out.println("It's grade D");
            
        }else
            System.out.println("It's Grade F and Fail");

    }
}
