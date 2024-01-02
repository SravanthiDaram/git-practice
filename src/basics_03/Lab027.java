package basics_03;

public class Lab027 {
    public static void main(String[] args) {
        // Implicit and Explicit -- change the data types to a different data type.
        // Implicit is not possible in norrowing problem 

        byte  a = 10;
        int b = a; // Implicit --widening
        System.out.println(b);

        int c = 130;
        byte d = (byte) c; // Explicit -- narrowing 
        System.out.println(d);

    }
    
}
