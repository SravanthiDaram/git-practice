package basics_06_24Dec;

public class Lab107 {
    public static void main(String[] args) {
        //FizzBuzz program
        //Write a program that prints from 1 to 100
        //For multiples of 3 print Fizz instead of 3
        //For multiples of 5 print Buzz instead of 5
        //For multiples for 3 and 5 both print FizzBuzz

        for (int i = 0; i <=100 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");

            }
            else {
                System.out.println(i);
            }
        }


    }
}
