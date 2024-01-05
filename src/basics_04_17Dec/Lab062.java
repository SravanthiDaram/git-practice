package basics_04_17Dec;

public class Lab062 {
    public static void main(String[] args) {

        int item_code = 005;
        switch (item_code){
            case 001 -> System.out.println("It's a laptop");
            case 002,003 -> System.out.println("It's a Ipad");
            case 004 -> System.out.println("It's a Desktop");
            default -> System.out.println("It's a pen");


        }
    }
}
