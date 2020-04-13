package repls;

import java.util.Scanner;

public class Repl_165 {

    /*
    isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true


     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    //    int add14to16Result = add2Numbers(14, 16);
    //    System.out.println( add14to16Result );     ,or we can print out directly:

        int newNum = scan.nextInt();
   boolean result = isEven(newNum);

        System.out.println(result);

    }


    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else{// if (n % 2 != 0) {
            return false;
        }

    }


}