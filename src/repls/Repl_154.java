package repls;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_154 {

    /*
        isPos is a method that checks if  an int positive or not positive
         If  the int num is positive print positive else print not positive
        Complete main method by calling isPos method for each element in the array arr.
    */
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
       int size = inp.nextInt();

        int[] arr = new int[size];

        for(int i=0 ;i<=size-1;i++) {

            arr[i] = inp.nextInt();

        }


        for(int i = 0 ; i < arr.length ; i++){
            isPos(arr[i]);
        }

    }


    public static void isPos(int num)
    {
        //#1 your code here

        if(num>0==true){
            System.out.println("positive");
        }else{
            System.out.println("not positive");
        }
    }

}


