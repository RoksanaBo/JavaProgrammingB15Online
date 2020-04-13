package repls;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class repl_155 {

    public static void main(String[] args) {
        //        Create a method called next3 .
        //        This method gets an int argument and prints
        //        the next 3 numbers after that number.
        //        Call the method from main method and pass num to it.

        //       enter number
        //        1
        //       next 3 are:
        //       2 3 4
        //       (put a space between numbers)


        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num =inp.nextInt();


        next3(num);


    }

    public static void next3(int nums) {



        if (nums >0 ) {
            System.out.println((nums + 1) + " " + (nums + 2) + " " + (nums + 3));
        }


    }

}










