package basics_05_23Dec;

public class Lab072 {

    public static void main(String[] args) {

        boolean b = true;
        b= false;

        for( ; b; ){

            System.out.println("true");// It will not print because b is false.

        }// In for loop you can use double, float, long, but it will increase as ++
    }
}
