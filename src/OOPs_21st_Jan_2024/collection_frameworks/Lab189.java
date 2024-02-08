package OOPs_21st_Jan_2024.collection_frameworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab189 {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Rama");
        Student s2 = new Student(23, "Priya");
        Student s3 = new Student(5, "Raani");

        List Students = new ArrayList();
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);

        System.out.println(Students);
        //Collections.sort(Students);
        Collections.sort(Students, new sortbynameAec());
        System.out.println(Students);
        Collections.sort(Students, new sortbynameDec());
        System.out.println(Students);

        Collections.sort(Students, new sortbyidDec());
        System.out.println(Students);



    }
}
