package OOPs_07_Jan2024.inheritance.multilevel;

public class Lab149 {
    public static void main(String[] args) {

        //Grandfather g = new Grandfather();
        //Father f = new Father();
        //Son s = new Son();

        Grandfather g = new Father();
        Grandfather g2 = new Son();
        //Father f = new Grandfather(); you can n't call this
        g.bhk3();
        Son s = new Son();
        s.bhk1();//Son can access all 3
        s.bhk2();
        s.bhk3();





    }
}
