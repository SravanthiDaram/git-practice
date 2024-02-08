package Collections_3rd_Feb_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab192 {
    public static void main(String[] args) {

        // we have three different types of sets
        //1. Hash set:- Generally prints the data not in the order
        //2.Tree ser:- It sort the data and then prints it.
        //3.Linked hashset :- It gives the output how you entered the order

        Set courses = new LinkedHashSet();
        courses.add("Java");
        courses.add("Selenium");
        courses.add("API");
        courses.add("C");
        courses.add("Python");

        System.out.println(courses);

    }
}
