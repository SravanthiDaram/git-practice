package basics_06_24Dec;

public class Lab102 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr1==arr2);// it's not equal bcoz it's assigned to different ref names

        int[] arr3 = arr1;
        System.out.println(arr3==arr1);// this will give true

        String a1 = "Sravanthi";
        String a2 = "Sravanthi";

        System.out.println(a1==a2);//In string we compare the values
        // but in arrays we don't compare the value generally it's ref.
        System.out.println(a1.equals(a2));



    }
}
