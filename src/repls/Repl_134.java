package repls;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given two arrays of ints sorted in increasing order,
 * outer and inner, print out true if all of the numbers
 * in inner appear in outer. Take advantage of the fact
 * that both arrays are already in sorted order.
 * Example:
 * input (outer): 1, 2, 4, 6
 * input (inner): 2, 4
 * output: true
 *
 * Example:
 * input (outer): 1, 2, 4
 * input (inner): 6, 5
 * output: false
 */
public class Repl_134 {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);

        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();

        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];

        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();


            for (int j = 0; j < sizeOuter; j++) {
                outer[j] = scan.nextInt();

                if(i==j){
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }

            }

        }
*/
        int[] sizeOuter = {1, 2, 4, 6};
        int[] sizeInner = {2, 4};

        for (int i = 0; i < sizeInner.length; i++) {
            //    inner[i] = scan.nextInt();

        }

            for (int j = 0; j < sizeOuter.length; j++) {
                //          outer[j] = scan.nextInt();
            }



    }
}











