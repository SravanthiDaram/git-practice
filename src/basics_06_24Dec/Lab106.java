package basics_06_24Dec;

public class Lab106 {
    public static void main(String[] args) {
        // arrays using while method

        int[] marks = new int[5];

        marks[0]= 43;
        marks[1]= 23;
        marks[2]= 43;
        marks[3]= 43;
        marks[4]= 43;

        int i=0;
        while(i< marks.length){
            System.out.println(marks[i]);
            i++;

        }


    }
}
