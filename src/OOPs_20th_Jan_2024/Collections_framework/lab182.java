package OOPs_20th_Jan_2024.Collections_framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class lab182 {
    public static void main(String[] args) {
        List mylist = new LinkedList<>();
        mylist.add("Chintu");
        mylist.add("Nivi");
        mylist.add(34);
        System.out.println(mylist);
        List<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(4);
        l.add(6);

        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
