package Collections_3rd_Feb_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab191 {
    public static void main(String[] args) {

        List courses = new ArrayList<>();

        courses.add("ATB");
        courses.add("MTB");
        courses.add("Java");
        courses.add("LAPIT");
        courses.add("SDET Blueprint");
        //how can you print this values
        System.out.println(courses);

        for(Object o: courses){
            System.out.println(o);
        }

        Iterator e = courses.iterator();
        while (e.hasNext()){
            System.out.println(e.next());
        }




    }
}
