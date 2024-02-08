package Collections_3rd_Feb_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab197 {
    public static void main(String[] args) {

        Set number = new HashSet();
        //Hashset not in the order and accepts null
        number.add(123456);
        number.add(12345);
        number.add(1234);
        number.add(123);
        number.add(12);
        number.add(null);

        System.out.println(number);


        Set number2 = new LinkedHashSet();
        //Linked hashset allows null and prints in the user order
        number2.add(123456);
        number2.add(12345);
        number2.add(1234);
        number2.add(123);
        number2.add(12);
        number2.add(null);

        System.out.println(number2);

        Set number3 = new TreeSet();
        //Tree set does not accept null and it prints in the sort order
        number3.add(123456);
        number3.add(12345);
        number3.add(1234);
        number3.add(123);
        number3.add(12);
        //number3.add(null);
        System.out.println(number3);


    }
}
