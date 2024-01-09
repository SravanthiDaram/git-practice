package basics_03;

public class Lab022{

public static void main (String[] args){

    // Logical operator || or 
    // true, true = true
    //true, false = true
    //false,true = true
    //false, false = false 

    int a =30;

    boolean b = a>50||a<50;

    System.out.println(b);


    // Logical operator && and 
    //true,true = true
    //true,false = false
    //false,true = false
    //false,false = false

    int c = 65;
    boolean d = c>75&&c<75;
    System.out.println(d);
    


}
}