package repls;

import java.util.Arrays;


/**
 * This method gets a string and returns the word count of that string.
 *
 * example:
 *
 * wordCount("foo bar")
 * returns 2
 *
 * wordCount("one two three")
 * returns 3
 *
 * wordCount("bla")
 * returns 1
 */


public class Repl_181 {

    public static void main(String[] args) {
        String word = "hello you yui world";
 //       wordCount(word);
        System.out.println(wordCount(word));

    }


    public static int wordCount(String words) {

        String[] splitted = words.split(" ");
//        System.out.println(Arrays.toString(splitted));

        int itenCount = splitted.length;
  //      System.out.println(itenCount);
    return itenCount;
    }

}
