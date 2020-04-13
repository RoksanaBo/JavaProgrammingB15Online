package repls;

import java.util.Arrays;

public class Repl_143_Array2D_MultiplicationTable {
    public static void main(String[] args) {


 /*        Two-dimensional Arrays - 2D array has a type such
           as int[][] or String[][], with two pairs of square brackets.
           The elements of a 2D array are arranged in rows and columns,
           and the new operator for 2D arrays specifies both the number
           of rows and the number of columns.

           You have  2D array multiplicationTable declared with 10 rows and 10 columns.
           Write java program to populate the array with multiplication
           table values like in the picture below:
*/

        int [][] multiplicationTable = new int[10][10];

        //TODO: type your code below


        for(int x = 0; x<10;x++){
            for(int y =0; y<10;y++){
                multiplicationTable[x][y]=(x+1)*(y+1);
            }
        }
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;






    }
}
