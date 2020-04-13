package B11_ArrayClassMethodPractice;

import java.util.Arrays;

public class Ex_2DArray {

    public static void main(String[] args) {

        int [][] arr2D = {    {1,2}  ,     {3, 4, 5, 6, 7} ,   {8,9}       };
        // length method:

        int length = arr2D.length;  //2

        for (int i = 0; i <arr2D.length ; i++) {
            System.out.println(Arrays.toString(arr2D[i] ) );

        }

        System.out.println("--------------------------------------------------------");

        // print each element one by one

        for (int i = 0; i <arr2D.length ; i++) {// checks each index of 1d array

            for (int j = 0; j <arr2D[i].length ; j++) {//
                System.out.print(arr2D[i] [j] + " ");

            }

        //    System.out.println(arr2D[i] [1]);
        }








    }
}
