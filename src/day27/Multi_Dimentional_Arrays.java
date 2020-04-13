package day27;

import java.util.Arrays;

public class Multi_Dimentional_Arrays {

    public static void main(String[] args) {

        int[] arrSingleDim = {1,2,3};

        // Two-Dimentional array: contains single dimentional arrays

        //                       0 1 2      0 1 2
        int[] [] arrTwoDim ={   {1,2,3}  , {4,5,6}   };
        // index                  0           1
        // arrTwoDim[0] = {1,2,3};

        System.out.println(arrTwoDim.length);
        System.out.println(Arrays.toString(arrTwoDim[0]));
        System.out.println(Arrays.toString(arrTwoDim[1]));

        // arr [] ------> {index num of elements}
        // arr [] [] ----> {
        System.out.println(arrTwoDim[0] [2]); // returns int value

        // print 5 : arrTwoDim[1] [1]
        System.out.println(arrTwoDim[1] [1]); // returns int value

        //Arrays.toString is ONLY APPLICABLE TO SINGLE DIMENTIONAL ARRAY

        //Arrays.deepToString (multi-D Arrays)
        System.out.println(Arrays.deepToString(arrTwoDim));













    }
}
