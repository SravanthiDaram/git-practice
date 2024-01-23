package OOPs_14th_Jan_2024;

public class Static_Demo {

    public static String collage_name = "The Testing Academy";

    //Instance variable or Local variable
    public int version = 10; // Instance variable

    //Static method
    public static void printname(){
        int a = 10; //Local variable
        System.out.println("Name is " + collage_name);
        //System.out.println("version is " + version); can't access because it's not a static variable.
        //only static variable are accessed in static function.

    }

    //non-static method
    void print_details(){
        System.out.println("The latest version" + version);// now it can access because it's not a static method.
        System.out.println("name is " + collage_name);// it is accessible by all type of methods

    }
}
