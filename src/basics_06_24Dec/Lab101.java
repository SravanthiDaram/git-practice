package basics_06_24Dec;

public class Lab101 {
    public static void main(String[] args) {

        int[] a= new int [4];// all values are stored with 0 and index is 0 to 3.
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        a[1]=99;
        a[2]=89;
        System.out.println(a[1]);

        final int[] b = new int[4]; // in this case final means -> the length is final for 4, not the values of b[0]...
        b[0]= 77;
        System.out.println(b[0]);



    }
}
