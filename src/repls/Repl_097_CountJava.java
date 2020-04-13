package repls;

import java.util.Scanner;

public class Repl_097_CountJava {

    public static void main(String[] args) {

 /*    Return the number of times that the string "java" appears anywhere in the given string word.

       Example:
       input: javaxjava
       output: 2

       Example:
       input: javaxjavaapplepearjavaegg
       output: 3

*/    //  Scanner scan= new Scanner(System.in);
      //  String word = scan.next();
String word = "javaxjavaapplepearjavaegg";
        int count=0;

        int index=word.indexOf("java");

        while(index!=-1){

            index=word.indexOf("java",index+1);

            count++;
        }
        System.out.println(count);



    }
}
