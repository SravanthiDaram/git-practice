package OOPs_21st_Jan_2024.collection_frameworks;

import java.util.Enumeration;
import java.util.Vector;

public class Lab185 {
    public static void main(String[] args) {
        // Enumeration is available in only Vector
        //Vector is syncronised nature

        Vector<String> v = new Vector();
        v.add("Sravz");
        v.add("Saanvi");
        v.add("Sahas");

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
