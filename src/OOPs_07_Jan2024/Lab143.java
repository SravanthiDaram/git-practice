package OOPs_07_Jan2024;

public class Lab143 {
    public static void main(String[] args) {

        ATBPerson p = new ATBPerson();// this one is calling default constructor
        p.printdetails();
        //p.name = "Sravanthi";
       // System.out.println(p.name);
       // System.out.println(p.phone_num);
        //System.out.println(p.age);
        //these will give the default values
        //String = null, int = 0, double =0.0, boolean = false
        //but if you create a variable in void method and print without assigning any value, the program will give error
        // these are called default constructor.
        ATBPerson p2 = new ATBPerson("sravz");// this one is calling from param constructor
        p2.printdetails();




    }
}
