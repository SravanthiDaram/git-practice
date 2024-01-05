package basics_05_23Dec;

public class Lab087 {
    public static void main(String[] args) {
        for (int i = 0; i <+10 ; i++) {
            if(i%2==0){
                System.out.println("even" +i);
                continue;
            }
            System.out.println("odd" +i);
        }
    }
}
