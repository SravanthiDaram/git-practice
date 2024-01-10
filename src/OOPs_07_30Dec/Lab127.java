package OOPs_07_30Dec;

public class Lab127 {
    public static void main(String[] args) {
        //print a string in reverse order

        String name = "Sravanthi";
        String y = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            y= y + name.charAt(i);

        }
        System.out.println(y);
    }
}
