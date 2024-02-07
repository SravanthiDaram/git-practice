package OOPs_20th_Jan_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab171 {
    public static void main(String[] args) throws Exception{

        main();
        //prone to error

    }
    static void readfile (String filename) throws Exception{
        File f = new File(filename);
        FileReader filereader = new FileReader(filename);
        if(filename.length() == 0){
            throw new FileNotFoundException();

        }
    }

    static void main(){
        int a;
        int b = 5;
        if (b==0){
            throw new ArithmeticException("a can not be zero");
        }
        else{
            a= 10/b;
            System.out.println(a);
        }


    }


}
