package repls;

import java.util.Arrays;

public class Repl_140 {

    public static void main(String[] args) {

  /*      Given a String array words, iterate through each
          word and print first and last letter of each
          element in the format below.

         Example:
          words → ["hello", "why", "by", "apple" , "note"]
          print → [ho, wy, by, ae, ne]
*/



        String[] words ={"hello", "why", "by", "apple" , "note"};

       for(String each : words) {
           String[] s =  each.split(" ]");
           System.out.print(Arrays.toString(s));

       }









  /*      String sentence2 = "Everything is Awesome!!!";
        //split by "e"
        String[] splitBy_e_Array = sentence2.split("e");
        System.out.println("splitBy_e_Array" + Arrays.toString(splitBy_e_Array));

        for(String eachPeaces :  splitBy_e_Array ){
            System.out.println("eachPeaces = < " + eachPeaces+ ">");
        }
*/

        }

    }

