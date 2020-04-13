package office_hour;

import java.util.Scanner;

public class Prac_12_02_2_WhileLoop_PrintEachCharacterUsingCharAt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
             //          0123456789
//        String name = "Arya Stark" ;
        String name = scan.nextLine();

        // getting each character using charAt(index)
        // generate sequential number 0 --> 10


        // is there any chance that while loop does not execute
        int x = 0;

        while (x < name.length()) {

            System.out.print("index: " + x);
            System.out.println(name.charAt(x));// I print first because I want to get my index ,starts with 0
            ++x;                              //  so I print first,then I increment the value ++x

        }


//        while( x < 15){
//            System.out.println("WOLA@");
//        }
//        System.out.println("THE END ");
    }
}

