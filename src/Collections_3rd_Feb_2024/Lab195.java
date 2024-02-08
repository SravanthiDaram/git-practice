package Collections_3rd_Feb_2024;

import java.util.PriorityQueue;

public class Lab195 {
    public static void main(String[] args) {

        PriorityQueue pq1 = new PriorityQueue();

        pq1.offer(10);
        pq1.offer(90);
        pq1.offer(60);
        pq1.offer(40);
        pq1.offer(50);
        //pq1.offer(null); Null pointer exception will come
        //Natural order will come

        System.out.println(pq1);

    }
}
