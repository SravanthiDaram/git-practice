package OOPS_13th_Jan_2024.Polymorphism.method_overriding;

public class Runnerclass {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();
        Hound h = new Hound();
        h.bark();
        Dog d1 = new Hound();// the object is created for Hound, so that's why it's calling only hound 
        d1.bark();

    }




}
