package OOPS_13th_Jan_2024.Encapsulation;

public class Lab147 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saanvi";
        s1.name = "Sahas";
        s1.print();
        // name can be changed easy in this method. If we don't want to change it how can we create
        // values can be changed by only getter and setter methods in inheritance.
        //Generally the values should be hidden.

        //calling another function Person

        Persons s2= new Persons();
        s2.id = 100;
        s2.name = "srav";
        //here we are able to change the id and the name but if id and name are consistent this method is not correct.
        //If you don't want to allow to change it then it should be hidden means encapsulated.
    }
}
