package OOPs_07_Jan2024.inheritance;

public class Lab148 {

    public static void main(String[] args) {

        Java j = new Java();// it will call the parent programming default constructor also calls the java default constructor.
        Programming p = new Programming();
        Programming p2 = new Programming("Davis",12);
        //p2.printInfo();
        //Programming p3 = new Java();
        j.car();
        j.bhk3();
        j.author = "Martin";
        j.printInfo();

        Python t = new Python();
        t.bhk3();




    }
}
