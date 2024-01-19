package OOPS_13th_Jan_2024.abstraction.Interface;

interface FatherI {
    void loan1k();

    default void print(){
        System.out.println(" I am default method");

    }

    static void print2(){
        System.out.println(" I am static method");
    }

}
