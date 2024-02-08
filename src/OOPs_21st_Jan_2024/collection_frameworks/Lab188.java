package OOPs_21st_Jan_2024.collection_frameworks;

import java.util.Stack;

public class Lab188 {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        s.push("E");
        System.out.println(s);

    }
}
