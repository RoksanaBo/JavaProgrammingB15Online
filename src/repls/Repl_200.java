package repls;

import java.util.Scanner;

/*
isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false

 */
public class Repl_200 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String str = scan.next();
        System.out.println(isError(str));

    }


    public static boolean isError(String line)
    {

     boolean b= line.substring(0,0+5).contains("error");

        if(b==true){
         b=true;
        }else {
            b=false;
        }

        return b;
    }


}
