package day28;

import java.util.Arrays;

public class ExelVisualizer2 {

    public static void main(String[] args) {

        int[][] myExcel= {
                             {10,27,88,99 }, // index 0 : this is first 1D array
                              { 87,100 } ,   // index 1 : this is second 1D array
                              { 90,45,65}    // index 2 : this is third 1D array
                          };
        System.out.println(Arrays.deepToString(myExcel));

        //Arrays.deepToString:
        // takes an multiD array and turn it into a String with all items.
        // It provides : multiD array object or multiD array variable

        for(int[]eachRow : myExcel   ){

            for( int eachCell     : eachRow     ){
                System.out.print(eachCell + " ");

            }
            System.out.println(); // chtobi v tri stolbika poluchilos
        }











    }
}
