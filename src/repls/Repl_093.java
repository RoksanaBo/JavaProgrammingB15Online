package repls;

import java.util.Scanner;

public class Repl_093 {

    public static void main(String[] args) {

     //   Given a string word, print true if "java" appears
        //   starting at index 0 or 1 in the string, such as with "javaxxx" or
        //   "xjavaxx" but not "xxjavaxx".
        //   The string may be any length, including 0word = .


  /*      int charCount = word.length();


        if(charCount==0){
            System.out.println("false");
        }else if()

   */


        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String first =word.substring(0,4);
        String sec = word.substring(1,5);
        System.out.println(first);
        System.out.println(sec);
        String onelet = word.substring(0,1);
        System.out.println(onelet);

        System.out.println(word.indexOf(0,4));


    }
}
