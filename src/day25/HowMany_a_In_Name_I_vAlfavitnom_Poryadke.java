package day25;

import java.util.Arrays;

public class HowMany_a_In_Name_I_vAlfavitnom_Poryadke {

    public static void main(String[] args) {

        // pick up your own name and turn it into char array
        // and use for each loop to loop over them
        // optionally count how many "a" you have in your name

        String name = "Anastasiya";
        // turn it into charArray using toCharArray() method of string
        char[] allCharsInName = name.toCharArray();

        for( char eachChar   :   allCharsInName) {
            System.out.println("before sorting " + eachChar);
        }

        // now count how many "a" we have
        int count =0;
         for(char eachChar  : allCharsInName) {
             if(eachChar=='a'){
                 ++count;
             }

        }
        System.out.println( count + " letters a ");

         // I want to sort all characters of name in alphabetic order
        Arrays.sort(allCharsInName);
        System.out.println("after sorting = " + Arrays.toString(allCharsInName));






    }
}
