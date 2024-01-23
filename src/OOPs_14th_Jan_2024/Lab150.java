package OOPs_14th_Jan_2024;

public class Lab150 {

    public static void main(String[] args) {

        //System.out.println(Static_Demo.collage_name);
        //Static_Demo.printname();

        Static_Demo s1 = new Static_Demo();
        s1.version = 100;
        s1.print_details();

        Static_Demo.collage_name = "KITS";

        Static_Demo s2 = new Static_Demo();
        s2.version = 199;
        s2.print_details();


    }
}
