package repls;

import java.util.Scanner;

/**
 * at3 gets two strings and returns a string.
 *
 * the first string is the one that will be manipulated.
 * at the 3rd char position of target you
 * will insert the word argument.
 * example use:
 *
 * at3("longword","foo")
 * will return: "lonfoogword"
 *
 * at3("blabla","a")
 * will return: "blaabla"
 */
public class Repl_184 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        String sec = scan.next();//"a";
        //           01234567
        String s1 = scan.next();//"blabla";

        at3(s1,sec);
        System.out.println( at3(s1,sec));

    }



    public static String at3(String target,String word){

        String a = target.substring(0,3);
        String b = target.substring(3,target.length());
        String c =(a+word+b);


   return c;
   }

}
