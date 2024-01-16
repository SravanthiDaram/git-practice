package OOPs_07_Jan2024;

public class Person {

    String name;

    Person(){
        System.out.println("Daram");
    }

    Person(String ref_name){
       this.name = ref_name;
    }
    void Printdetails(){
        System.out.println("Your name is " +this.name);
    }
}
