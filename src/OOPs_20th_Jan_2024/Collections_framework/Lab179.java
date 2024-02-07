package OOPs_20th_Jan_2024.Collections_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab179 {
    public static void main(String[] args) {

        List mylist = new ArrayList();
        mylist.add("Sravs");
        mylist.add("Vijay");
        mylist.add(34);
        mylist.add("Saanvi");
        mylist.add("Sahas");
        mylist.add(123);

        System.out.println(mylist);
        mylist.remove(2);
        System.out.println(mylist);
        mylist.set(3,"Shiva");
        System.out.println(mylist);
        // traditional for loop
        for(int i=0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
        //another method for for loop or it's called for each loop
        for(Object o : mylist ){
                System.out.println(o);
        }
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
