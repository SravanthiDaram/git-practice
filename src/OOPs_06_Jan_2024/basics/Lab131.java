package OOPs_06_Jan_2024.basics;

public class Lab131 {
    public static void main(String[] args) {

        String name = "sravanthi";

        System.out.println(name.concat(" vijay"));
        System.out.println(name.contains("a"));

        String expected_result = "Sravz@123";
        String actual_result = "sravz@123";
        System.out.println(expected_result==actual_result);
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }


    }
}
