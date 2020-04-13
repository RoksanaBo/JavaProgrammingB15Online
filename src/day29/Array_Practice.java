package day29;

import java.util.Arrays;

public class Array_Practice {

    public static void main(String[] args) {

        // create an int array with size 100 and fill it up as below
        //fill up this array with number from 1 to 100


        int[] numbers = new int[100];
        System.out.println(Arrays.toString(numbers) );

//        numbers[0] =1;
//        numbers[1] =2;
//        numbers[2] = 3;
 //       ...............
//        numbers[99] = 100;
//        System.out.println(Arrays.toString(numbers));


        for(int x=0; x<numbers.length;x++){
            numbers[x]=x+1;

        }
        System.out.println("After filling up \n" + Arrays.toString(numbers));
       //     \n will move it to next line












    }
}
