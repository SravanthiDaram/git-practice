package basics_03;

import java.util.Scanner;

public class Lab048 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("a is the max number" +a);
        }else{
            System.out.println("b is the max number" +b);
        }

    }
    
}
