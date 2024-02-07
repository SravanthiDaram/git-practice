package OOPs_14th_Jan_2024.Innerclass;

public class Lab160 {

    public static void main(String[] args) {

        int x = 123; //primitive
        // String st1 = x; not possible, you cannot assign a int to string
        String st1 = x+"";// concatenation is possible
        String s1 = String.valueOf(x);
        System.out.println(s1);
        System.out.println(st1);

    }
}
