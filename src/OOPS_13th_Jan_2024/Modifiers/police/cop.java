package OOPS_13th_Jan_2024.Modifiers.police;

public class cop {
    //Modifiers are 3 types
    //public, private, and protected
    public int gun;// default public
    //it's a modifier, return, name of the variable

    public cop(int gun){ //parm constructor
        this.gun = gun;

    }

    protected void canIShoot(){
        System.out.println("of-course shoot");

    }

}
