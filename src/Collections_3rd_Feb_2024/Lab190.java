package Collections_3rd_Feb_2024;

import java.util.HashSet;
import java.util.Set;

public class Lab190 {

    public static void main(String[] args) {
        //Hashset generally don't store the values in the order
        //It stores only unique values

        Set fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Lychee");
        fruits.add("Orange");
        fruits.add("Lychee");

        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("apple"));// It's a case-sensitive

    }
}
