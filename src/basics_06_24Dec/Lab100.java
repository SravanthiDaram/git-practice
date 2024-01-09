package basics_06_24Dec;

public class Lab100 {

    public static void main(String[] args) {
        // Arrays concepts
        int a = 10; // is a single number assignment
        int [] marks = {92,94,82,87,81,60};// it's  an array. it holds same type of data type values

        String [] items = {"milk","cheese","eggs","spinach","chips"};
        System.out.println( items[0]);
        System.out.println(items[3]);// arrays starts the allocation from 0,1,2,...
        //System.out.println(items[6]);// it will give exception because there is no 6th item allocated
        System.out.println(items.length); // length starts for 1,2,3...



    }
}
