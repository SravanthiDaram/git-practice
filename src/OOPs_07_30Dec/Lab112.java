package OOPs_07_30Dec;

public class Lab112 {
    public static void main(String[] args) {

        int c = A_sum(6,7);
        int c1 = A_sum(2);
        int c3 = A_sum(3,4,5);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c3);
        sayhello();

    }

    static int A_sum(int a,int b){
        return a+b;
    }
    static int A_sum(int a){
        return a;

    }
    static int A_sum(int a, int b, int c){
        return a*b*c;

    }
    static void sayhello() {
        System.out.println("Hi");
    }
}


