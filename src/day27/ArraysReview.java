package day27;

import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {

        // ARRAY IS A VARIABLE THAT ALLOWS US TO STORE MULTIPLE VALUES
        // regular variables---> we can only store one single value int a=10;
        // array variables ----> int[] arr ={1,2,3 };
        //                         index:    0 1 2
        // retrive (izvlekat') data---->   arrayName[indexNumber] ---->element of that index number
        //

        int num =10;
        int[] arr ={10,20, 30, 40,50,60};
        int num1= arr[arr.length - 1];  // length returns the total number of elements from the array
        System.out.println(num1);
        System.out.println("------------------------------------------------------------------------------");

        //How to separate 10 20 30 40 50 60

        for(  int x = 0; x < arr.length;  x++ ){
            System.out.print( arr[x]+" "   );  // razdelili value with space
            System.out.println("\n-----------------------------------------------------------------------------");
        }

     //  How to convert Arrays.toString(VariableName):
        String str = Arrays.toString(arr);
        System.out.println( str );










    }
}
