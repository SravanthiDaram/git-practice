package OOPs_06_Jan_2024.basics;

public class Lab130 {
    public static void main(String[] args) {
        // Learning about Strings
        //1. String constant pool
        //2.Heap area

        String name = "Sravanthi";// This will create in String pool
        String name2 = new String("Sravanthi");// This will create in object area. Both will be created in heap area.

        name = "Vijay"; // now if you print it will be Vijay but name sravanthi is available in string pool for longer time.
        // Original string remains unchanged. That's why it's called immutable in nature.
        // example: Sarees and marriage :)


    }
}
