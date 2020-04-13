package repls;

import java.util.Arrays;
import java.util.Scanner;

/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust
 */
public class Repl_191_ReverseString {
    public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);

     String str=scan.next();
    reverse(str);
        System.out.println(reverse(str));

    }
    public static String reverse(String input){

        String reversedWord = "";
        for (int index = input.length() - 1; index >= 0; index --) {
            reversedWord += input.charAt(index);
        }
        return reversedWord;
        // String input="foo";

    }
}