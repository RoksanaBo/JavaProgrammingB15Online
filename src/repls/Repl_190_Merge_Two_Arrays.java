package repls;


import java.util.Arrays;
import java.util.Scanner;

/*
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (that's the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */
public class Repl_190_Merge_Two_Arrays {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        int[] a1 = {scan.nextInt()};
        int[] b1 = {scan.nextInt()};

        mergR(a1,b1);
        System.out.println(Arrays.toString(mergR(a1,b1)));


    }

    public static int[] mergR(int[] a, int[] b) {

        int length = a.length + b.length;

        int[] ret = new int[length];

        int z = 0;

        for (int element : a) {
            ret[z] = element;
            z++;
        }

        for (int element : b) {
            ret[z] = element;
            z++;
        }


        return ret;
    }


}



















