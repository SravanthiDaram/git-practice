package OOPs_14th_Jan_2024.Innerclass;

public class Lab152 {
}

class OC{
    int a = 10;//Instance variable


    class Innerclass{
        //Inner classes can access outer variables or functions but outer class can not access
        int b =15;

        void m2(){
            System.out.println(a);// ex: you are already in my room, so you can take pen
            // variable a is a outer class variable inner class can access
        }
    }

}
