package OOPs_20th_Jan_2024;

public class customexception extends Exception{

    customexception(String msg){
        super(msg);
        System.out.println("If I got this, this is a custom exception");
    }

}
