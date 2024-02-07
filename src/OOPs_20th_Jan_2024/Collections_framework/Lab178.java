package OOPs_20th_Jan_2024.Collections_framework;

import java.util.List;

import static java.util.List.of;

public class Lab178 {
    public static void main(String[] args) {

        //in list of function we can not add new values into it. It's a static function, it's basically fixed.

        List fruits = List.of("orange", "banana", "apple", "melon", "cherry");
        List shopping_items = List.of("egg", "bread", "butter", "chaco chips");
        List my_10th_marks = List.of(89, 99, 96, 87,88);
        List different_data_types= List.of("Sravanthi", 33, "187 Arrowhead cir");

        System.out.println(fruits.get(2));
        System.out.println(shopping_items.get(1));
        System.out.println(shopping_items.toArray().length);
        System.out.println(fruits.size());
        System.out.println(fruits.indexOf("apple"));
        System.out.println(fruits.isEmpty());
        //fruits.remove("apple"); remove and add both we cannot do it.


    }
}
