package OOPS_13th_Jan_2024;

public class Blocks {
    // Instance Initialization Block
    {
        System.out.println("IIB");
    }

    Blocks(){
        System.out.println("DC");
    }

    static { // Static Initialization Block
        System.out.println("SIB");

    }

}
