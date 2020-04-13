package repls;

import java.util.Scanner;

/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true.

 */
public class Repl_169 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean a = scan.nextBoolean();
        boolean b = scan.nextBoolean();
        boolean c = scan.nextBoolean();


        System.out.println(threeLocks(a,b,c));
    }


    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        if(a==true && b==true   || c==true){
            return true;
        }else {
            return false;
        }
    }
}
