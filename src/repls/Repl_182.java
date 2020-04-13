package repls;

import java.util.*;

/**
 * This method gets two strings (text and badWord)  and returns a string.
 *
 * basally what it dose is take out all the occurrences of badWord in text.
 *
 * for example:
 *
 * clean ("one two three","two")
 * returns "one three"
 *
 * clean ("foo bar","foo")
 * returns "bar"
 *
 * clean ("he said bla bla bla","bla")
 * returns "he said "
 */
public class Repl_182 {

    public static void main(String[] args) {


    }


    public static String clean (String text ,String badWord) {

        String s1 ="one two three";
        String bads1 = "two";
        Collection<String> names = new ArrayList<>();

        names.add(s1);
        names.add(bads1);
        System.out.println(names);


     return bads1;
    }
}
