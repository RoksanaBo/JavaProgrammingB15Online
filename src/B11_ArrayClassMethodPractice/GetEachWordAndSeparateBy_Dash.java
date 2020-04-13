package B11_ArrayClassMethodPractice;

import java.util.Arrays;

public class GetEachWordAndSeparateBy_Dash {

    public static void main(String[] args) {

        //use the method you learned to get each word and store it into String Array:
        //          loop through each item --in each iteration loop:
        //          turn each word into char array print each char out
        //          with separated by "- "

        String words ="Cybertek Batch Spartan  most hardworking Batch ever" ;

       String w = words.substring(words.charAt(0));
     //   String[] words = str.split(" ");

     //   System.out.println(Arrays.toString());



 /*       String str ="Cybertek Batch Spartan is most hardworking Batch ever" ;
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words)); // to see what's inside the array

       for (int i = 0; i <words.length ; i++) {
           // System.out.println(words[i]);

           String one = words[i]; // C-y-b-e-r-t-e-k-
           char[] cyberChars = one.toCharArray() ;

           for(int j=0; j < cyberChars.length; j++) {
               System.out.print(cyberChars[j] + "-");
           }

            System.out.println();
        }








*/



    }
}
