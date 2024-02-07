package OOPs_20th_Jan_2024;

public class Lab170 {
    public static void main(String[] args) {

        // if we generally give a =10/0 it's arithmetic error and JVM create for us but instead of jvm we can handle
        //using throw method
        extracted(0);

    }

    private static void extracted (int b){
        int a = 0;
        if(b==0){
            throw new ArithmeticException("b can't be zero");
        }else{
            a= 10/b;
            System.out.println(a);
        }
    }
}
