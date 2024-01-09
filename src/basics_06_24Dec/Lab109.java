package basics_06_24Dec;

public class Lab109 {
    public static void main(String[] args) {

        int[] a = {1,2,3};

        int[][] array= new int [3][3];

        array[0][0] = 23;
        array[0][1] = 24;
        array[0][2] = 25;

        array[1][0] = 26;
        array[1][1] = 27;
        array[0][2] = 28;

        array[2][0] = 29;
        array[2][1] = 30;
        array[2][2] = 31;

        for (int i = 0; i < array.length; i++) {
            for(int j =0; j< array[i].length; j++){

                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");

        }


    }
}
