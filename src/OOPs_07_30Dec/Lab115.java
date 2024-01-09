package OOPs_07_30Dec;

import java.util.Scanner;

public class Lab115 {
    public static void main(String[] args) { // in one class we can use many main functions,
        // but it should be different arguments
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        System.out.println(scanner.next());
        main(10);// call the function

    }

    public static void main(int a) { // function definition, you have to call the definition otherwise no use.
        System.out.println("print a " +a);

    }
}
