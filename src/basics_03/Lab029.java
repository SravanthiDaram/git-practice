package basics_03;

public class Lab029 {
public static void main(String[] args){

    String s1 = "Sravanthi";// This will store in string constant pool SCR or string pool
    String s2 = new String("Sravanthi"); // This will store in Object area

    Boolean s3 = (s1 == s2);

    System.out.println(s3); // if you compare references it will give false because it's storing in different places. 
    


}
}