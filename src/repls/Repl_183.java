package repls;
import java.util.Scanner;
/**
 * This method gets a string and an int, it returns a string.
 *
 * what it dose is limit the inputted string to a cretin number of characters.
 *
 * for example:
 *
 * limit("abcd",2)
 * returns "ab"
 *
 * limit("bla bla",3)
 * returns "bla"
 */
public class Repl_183 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String t =scan.next();

        int i = scan.nextInt();// 3;

        limit(t,i);
        System.out.println(limit(t,i));
    }

    public static String limit(String text, int maxLength) {

        String s =text.substring(0,maxLength);
        return s;
    }

}