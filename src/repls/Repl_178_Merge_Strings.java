package repls;

import java.util.Arrays;

/**
 * When gears merge and work together,
 * one teeth from each one goes in order.
 * Write a method mergeStrings hat will return
 * the strings merged, one letter at a time, starting with one.
 * Please note one and two can be of different lengths.
 * Please look at below examples:
 *
 * s1 ==> "12345"
 * s2 ==> "abcde"
 * mergeStrings(s1,s2) ==> "1a2b3c4d5e"
 *
 * mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
 *
 * mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */
public class Repl_178_Merge_Strings {
    public static void main(String[] args) {

        String s1 = "wooden";
        String s2 = "spoon";

  //          mergeStrings(s1,s2);
        System.out.println(mergeStrings(s1,s2));
    }



    public static String mergeStrings(String one, String two) {



        String merged = "";
        int len = 0;

        if (one.length() >= two.length()){
            len = one.length();
        } else {
            len = two.length();
        }


        for (int i = 0; i < len; i++){
            if (i < one.length()){
                merged += one.charAt(i);
            }

            if (i < two.length()){
                merged += two.charAt(i);
            }

        }
        return merged;
    }
}





