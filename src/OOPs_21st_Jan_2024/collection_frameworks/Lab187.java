package OOPs_21st_Jan_2024.collection_frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab187 {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(89);
        marks.add(99);
        marks.add(56);

        Collections.sort(marks);
        System.out.println(marks);
    }
}
