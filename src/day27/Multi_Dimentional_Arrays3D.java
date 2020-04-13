package day27;

import java.util.Arrays;

public class Multi_Dimentional_Arrays3D {

    public static void main(String[] args) {

        // 2D Array: contains 1 dimentional array
        int[][] arr2D = {      {1,2,3}  ,   {4,5,6}}   ;

        // 3D Array: contains 2D array
        //                         0          1                    0            1
        int[][][] arr3D = {    { {1,2,3} , {4,5,6} }     ,     { { 7,8,9} , {10,11,12} }       };
        //                                    0                                    1
        //   print 9:
        System.out.println( arr3D[1] [0] [2]);   // returns value

        // print 2:
        System.out.println( arr3D[0][0][1]);    // returns value

        // print {1,2,3}  :
        System.out.println(Arrays.toString(arr3D [0][0])  );

        // print {10,11,12}  :
        System.out.println( Arrays.toString(arr3D[1][1] )  );

        // print { { 7,8,9} , {10,11,12} }   :
        System.out.println(Arrays.deepToString(arr3D[1] )  );     //  returns 2d array

       // print {    { {1,2,3} , {4,5,6} }     ,     { { 7,8,9} , {10,11,12} }       };
        System.out.println(Arrays.deepToString( arr3D));

        // print each element of array:
        for(int i=0; i < arr3D.length; i++){                // each index of 2D array
            for(int j=0; j < arr3D[i].length; j++) {         // each index number of 1D array
                for(int k=0; k < arr3D[i][j].length; k++) {  // each index number of the value

                    System.out.print(arr3D[i][j][k]  + " ");   // returns values
                }
            }
        }




















    }
}
