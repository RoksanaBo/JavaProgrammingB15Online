package repls;

import java.util.Arrays;

/**
 * Given a String array arr with the following elements
 * ["zero", "one", "two","three","four"]
 *
 * Create another array fewValues and copy words that have letter "e" in them
 *
 * You need to know how many element contain "e" and create array accordingly
 *
 * Values in fewValues array need to be["zero", "one","three"]
 *
 * Examples:
 * arr -> ["aa", "be", "lol", "lel", "oreo"]
 * fewValues -> ["be",  "lel", "oreo"]
 *
 * arr -> ["e", "hey", "bye", "furey", "spoon"]
 * fewValues ->["e", "hey", "bye", "furey"]
 */

public class Repl_129_HowManyWords_Contain_e {

    public static void main(String[] args) {

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"aa", "be", "lol", "lel", "oreo"};
        System.out.println(Arrays.toString(getWithE(numbers)));


    }
    public static String[] getWithE(String[] arr) {

        String result = "";
        for (String each : arr) {
            if (each.contains("e")) {
                result += each + " ";
            }

            String[] fewValues = result.split(" ");

        }
        String[] fewValues = result.split(" ");
        return fewValues;
    }

}





