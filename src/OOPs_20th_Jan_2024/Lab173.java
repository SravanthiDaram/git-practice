package OOPs_20th_Jan_2024;

import java.io.File;
import java.io.FileReader;

public class Lab173 {
    public static void main(String[] args) {
        int a = 10/0;// unchecked

        try{//checked
            FileReader f = new FileReader(new File("C://sravat.txt"));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
