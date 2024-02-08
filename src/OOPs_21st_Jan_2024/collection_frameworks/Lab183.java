package OOPs_21st_Jan_2024.collection_frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab183 {
    public static void main(String[] args) {

        List course_list = new ArrayList();
        course_list.add("ATB");
        course_list.add("MTB");
        course_list.add("PyATB");
        course_list.add("LAPIB");
        course_list.add("SDET Blueprint");

        List numlist = new ArrayList();
        numlist.add(123);
        numlist.add(345);
        numlist.add(333);
        numlist.add(555);

        course_list.addAll(numlist);
        //System.out.println(course_list);

        //Iterator is the best one to use.

        Iterator iterator = course_list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
