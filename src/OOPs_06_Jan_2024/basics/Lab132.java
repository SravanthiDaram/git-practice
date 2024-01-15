package OOPs_06_Jan_2024.basics;

public class Lab132 {
    public static void main(String[] args) {

        String name = "sravanthi";
        String name2 = new String("sravanthi");
        String name3 = new String("Daram");
        //name2.concat(name3);


        System.out.println(name == name2);//it's flase bcoz created in different areas string pool and object area
        System.out.println(name.equals(name2));//it's true bcoz it's checking through the values.
        System.out.println(name2.equalsIgnoreCase(name3));

    }
}
