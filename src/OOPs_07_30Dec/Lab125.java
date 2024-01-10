package OOPs_07_30Dec;

public class Lab125 {
    public static void main(String[] args) {
        // using 2 loops to print the array values

        int[][] array_2d = new int[3][3];
        array_2d[0][0]=1;
        array_2d[0][1]=2;
        array_2d[0][2]=3;
        array_2d[1][0]=4;
        array_2d[1][1]=5;
        array_2d[1][2]=6;
        array_2d[2][0]=7;
        array_2d[2][1]=8;
        array_2d[2][2]=9;

        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                //System.out.printf("\t" + array_2d[i][j]);// to print the array
                if(i==j){
                    System.out.println(array_2d[i][j]);
                }
            }
            //System.out.println();

        }

        }

    }

