package OOPs_07_30Dec;

public class Lab117 {
    public static void main(String[] args) {
        System.out.println("run fine");

        String s = main("Saanvi");
        System.out.println(s);
        int d = main(10);
        System.out.println(d);

    }
    static String main (String a){
        System.out.println("I am a main function but JVM doesn't recognise me");
        return a;

    }
    static int main(int a){
        return a+120;

    }
}
