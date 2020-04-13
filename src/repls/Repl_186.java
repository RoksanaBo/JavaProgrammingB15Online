package repls;

import java.util.Scanner;

/**
 * The method gets a string and returns a string minus the first string.
 *
 * for example:
 *
 * removeFirst("aaa")
 * returns "aa"
 */
public class Repl_186 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        removeFirst(s);
        System.out.println(removeFirst(s));
    }

    public static String removeFirst(String target) {


     // String result ="";


        String result = target.substring(1,target.length());

        //     //   System.out.println(result);


        return result;
    }
}


