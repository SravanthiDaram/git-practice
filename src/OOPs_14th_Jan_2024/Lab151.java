package OOPs_14th_Jan_2024;

public class Lab151 {

    public static void main(String[] args) {

        P01 p01 = new P01();
        P01 p02 = new P01();
        p01.m1();
        p01.m2();
        P01 p03 = null;
        //p03.m1();// It will give null pointer error
        p03.m2();// it's gonna print bcoz it's a static method


    }
}
    class P01 {
        static {
            System.out.println("SIB");
        }

        {
            System.out.println("IIB");
        }

        int a = 10; // Instance variable

        static int b = 20;

        void m1() {
            System.out.println("m1");
            System.out.println(a);
            System.out.println(b);
        }

        static void m2() {
            System.out.println(b);
        }

    }
