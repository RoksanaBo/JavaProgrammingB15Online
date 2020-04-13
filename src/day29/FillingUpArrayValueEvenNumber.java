package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {

    public static void main(String[] args) {

        // create an int array with size 100 and fill it up as below


        // fill up this array with even number starting from 0


        int[] numbers = new int[100];


//                                           \n will move it to next line


        System.out.println("Before filling up default value \n" + Arrays.toString(numbers));


//  this is what we would do without the loop
//        numbers[0] = 0 ;   // 0 * 2
//        numbers[1] = 2 ;   // 1 * 2
//        numbers[2] = 4 ;   // 2 * 2
//        numbers[3] = 6 ;   // 3 * 2
//        numbers[4] = 8 ;   // 4 * 2
//        numbers[5] = 10 ;  // 5 * 2
//        //.....
//        numbers[99] = 198 ; // 99 * 2
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i * 2;
        }
        //  numbers[x] = x * 2

        System.out.println("After filling up \n" + Arrays.toString(numbers));

        //   Create an array with size 300 and fill it up with I Love Java
        String [] strArr = new String[300];
        strArr[0] ="I love Java";
        strArr[1] ="I love Java";
        strArr[2] ="I love Java";

        for(int i =0; i< strArr.length;i++){
            strArr[i] = "I love Java";
        }
        System.out.println(Arrays.toString(strArr));

        //    kak napisat' cifru pered predlojeniem
        String [] strArrr = new String[300];
        strArr[0] ="I love Java";
        strArr[1] ="I love Java";
        strArr[2] ="I love Java";

        for(int i =0; i< strArrr.length;i++){
            strArrr[i] = (i+1) + ".I love Java";
        }
        System.out.println(Arrays.toString(strArrr));




        //
        String str = new String("ABC");// this is String object with value ABC
        String[] strArr2 =new String[5]; // Empty String array with capacity 5;
        strArr2[0] ="I love Java";
        strArr2[1] ="I love Java";
        strArr2[2] ="I love Java";
        strArr2[3] ="I love Java";
        strArr2[4] ="I love Java";
        System.out.println(Arrays.toString(strArr2));




    }
}
