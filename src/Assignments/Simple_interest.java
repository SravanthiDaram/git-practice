package Assignments;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principle");
        double Pr = sc.nextDouble();
        System.out.println("Enter the Interest rate");
        int IR = sc.nextInt();
        System.out.println("Enter the term");
        double Term = sc.nextDouble();
        double Total_Interest = 0;
        double End_Balance=0;


        if (Pr>0){
            Total_Interest = (Pr*IR*Term)/100;
            End_Balance = Pr+Total_Interest;
        }
        System.out.println("Total Interest is" + Total_Interest);
        System.out.println("End_Balance is"+ End_Balance);
    }


}
