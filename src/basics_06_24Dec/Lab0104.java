package basics_06_24Dec;

public class Lab0104 {

    public static void main(String[] args) {

        int[] a = {34,45,56,34};
        long[] l = {32l,34l,55l};
        String[] b= {"Vijay","Sravanthi","Saanvi","Sahas"};
        float[] c= {1.23f, 2.34f,3.45f,5.67f};
        double[] d = {1.23,33.4,22.3,34.5};
        boolean [] e = {true, false, true, false};
         char [] f = {'a','e','i','o','u'};

        System.out.println("string of the length is" + b.length);

        for (int i = 0; i < b.length ; i++) {

            System.out.println(b[i]);

        }

    }
}
