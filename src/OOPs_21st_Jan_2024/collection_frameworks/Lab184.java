package OOPs_21st_Jan_2024.collection_frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab184 {
    public static void main(String[] args) {

        List ttacourselist = new ArrayList();

        ttacourselist.add("ATB");
        ttacourselist.add("MTB");
        ttacourselist.add("LAPIT");
        ttacourselist.add("SDET Blueprint");
        ttacourselist.add("Java for Testers");

        ListIterator ls = ttacourselist.listIterator(ttacourselist.size());
        while(ls.hasPrevious()){
            System.out.println(ls.previous());
        }

    }
}
