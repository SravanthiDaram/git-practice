package OOPS_13th_Jan_2024.Polymorphism.method_overloading;

public class person {

    void speak(String a){
        System.out.println("it's a string" +a);
    }
    void speak(int b){
        System.out.println("it's an integer" +b);
    }
}
