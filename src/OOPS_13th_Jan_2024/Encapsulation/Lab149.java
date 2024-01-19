package OOPS_13th_Jan_2024.Encapsulation;

public class Lab149 {

    public static void main(String[] args) {

        ICICIBank b = new ICICIBank("Pramod", 100);
        b.setBal(-1);// This we should not allow or give a condition
        b.setName("sravanthi");

        System.out.println(b.bal + b.name);
    }
}
