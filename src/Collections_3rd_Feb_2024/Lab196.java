package Collections_3rd_Feb_2024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab196 {
    public static void main(String[] args) {

        Queue<Integer>  integerqueue = new PriorityQueue<>();

        integerqueue.add(1);
        System.out.println(integerqueue);
        integerqueue.poll();
        System.out.println(integerqueue);

        Queue it = new PriorityQueue();
        it.add("A");
        it.add("B");
        it.add("C");

        System.out.println(it);

        Iterator Teen = it.iterator();
        while(Teen.hasNext()){
            System.out.println(Teen.next());
        }


    }
}
