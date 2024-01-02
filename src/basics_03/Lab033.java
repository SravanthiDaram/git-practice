package basics_03;

public class Lab033 {

    public static void main(String[] args) {

        String name = "Saanvi"; // creates in String pool
        String name1 = "Saanvi";// creates in String pool
        String name2 = new String("Saanvi");

        System.out.println(name == name1);// true bcz ref are different but the values are same also created in same string pool

        System.out.println(name == name2); //false bcz name2 created in object area.

        System.out.println(name.equals(name2)); // this will return true

        


    }
}
