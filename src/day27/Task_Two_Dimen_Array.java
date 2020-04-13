package day27;

import java.util.Arrays;

public class Task_Two_Dimen_Array {

    public static void main(String[] args) {

        int[] [] arr2D = {   {10,20,30}  , {40,50,60,70,80,90,100}    };
        //                      0                    1

        for(int[] each1DArray : arr2D){

            for(int eachElement  :  each1DArray){ // eachElement represents each element than contains in each1DArray
                System.out.println(eachElement + " ");// " "----> for space
            }

        }









    }

}
