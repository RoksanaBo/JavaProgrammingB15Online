package repls;

import java.util.Scanner;

public class Repl_167 {
/*
The danish prince most famous quote is "to be or not to be". that's a classic example of boolean logic.
the hamletQuote method only returns true if one of  or both of the boolean parameters is true.
example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false
hint: use the truth table for this one, this can be done with one if and a logical operator.
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean toBe = scan.nextBoolean();
        boolean notToBe = scan.nextBoolean();

     if(hamletQuote(true,true)||hamletQuote(true,false) || hamletQuote(false,true)) {


         System.out.println(true);
     }else {
         System.out.println(false);
     }


    }


    public static boolean hamletQuote(boolean toBe,boolean notToBe)
    {
        if((toBe==true &&  notToBe==true)  || (toBe==true &&notToBe==false) || (toBe==false && notToBe==true)){
            return true;
        }else {
            return false;
        }


    }
}