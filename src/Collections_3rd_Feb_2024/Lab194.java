package Collections_3rd_Feb_2024;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab194 {
    public static void main(String[] args) {
        // Queues

        Queue q1= new PriorityQueue();
        q1.offer(34);
        q1.offer(44);
        q1.offer(65);
        q1.offer(1);

        System.out.println(q1);

        q1.add(99);
        System.out.println(q1);

        System.out.println(q1.poll());
        System.out.println(q1.peek());

    }
}
