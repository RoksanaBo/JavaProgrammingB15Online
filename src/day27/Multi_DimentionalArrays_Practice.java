package day27;

import java.util.Arrays;

public class Multi_DimentionalArrays_Practice {

    public static void main(String[] args) {

        // N dimentional Array MUST contains (N-1) dementional arrays
        // 2 diment arrays MUST contains (2-1) dementional arrays

        //                         0             1             0           1
        String[] [] names = {   {"Rukhshona" , "Ghoya" }  , {"Hasan" , "Tetiana" }   };
        //                                  0                        1
        // print Hasan:
        System.out.println(names[1] [0]);  // Hasan
        System.out.println(names[1] [1]);  // Tetiana

        // menyaem   Tetiana na Dilshat
        names[1] [1] = "Dilshat";
        System.out.println(names[1] [1]);

        // print Hasan and Dilshat:
        System.out.println(Arrays.toString(names[1] ) );

        // print entire array  {   {"Rukhshona" , "Ghoya" }  , {"Hasan" , "Tetiana" }   }
        System.out.println(Arrays.deepToString( names ));


        int[] [] numbers = {     {1,2,3}  ,  {4,5,6} ,  {7,8,9} ,  {10, 11, 12, 13}  };
        //                         0            1          2               3

        for(int i = 0; i < numbers.length ; i++) {

            System.out.print(Arrays.toString(numbers[i]  ) );
        }

        System.out.println("-----------------------------------------------------------------------------------");


        // 1 2 3 4 5 6 7 8 9 10 11 12 13
        for(int i = 0; i < numbers.length ; i++) {
            for(int j =0; j < numbers[i].length ; j++ ){
                System.out.println( numbers[i] [j]+" " ); // j checks each element of arrays
            }
        }
        System.out.println("------------------------------------------------------------------------------");










    }
}
