package OOPs_06_Jan_2024;

public class Lab133 {
    public static void main(String[] args) {

        String s1 = "sravz";
        String s2 = new String("sravz");
        //immutable in nature (that can't be changed)
        StringBuilder sb3 = new StringBuilder("Sravanthi");
        StringBuffer sbfu = new StringBuffer("Hello");
        //mutable(the value can be changed)

        sb3.append(" Daram");
        sbfu.append(" world");
        System.out.println(sb3);
        System.out.println(sbfu);



    }
}
