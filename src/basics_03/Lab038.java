package basics_03;

public class Lab038 {
    public static void main(String[] args) {
        // Ternory operator 
        int a = 20;
        int b = 60;
        int c = 40;

        int max = a>b ? (a>c ? a:c) : (b>c ? b : c);
        System.out.println(max);


    }
    
}
