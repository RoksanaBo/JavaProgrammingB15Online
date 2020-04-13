package repls;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_130_Shift_Left_ArrayNumbers {


    /*   Modify an array that is "left shifted" by one -- so {6, 2, 5, 3}
         becomes {2, 5, 3, 6}. You may modify and print the given
         array, or print a new array.
         Example:
         input: 6, 2, 5, 3
         output: [2, 5, 3, 6]
    */
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i <= size; i++) {
            nums[i] = scan.nextInt();

        }

        int[] arr = new int[nums.length];

        for (int x = 0; x <nums.length-1 ; x++) {
            arr[x]=nums[x+1];
        }
        arr[arr.length-1] = nums[0];

        System.out.println(Arrays.toString(arr));



// swap first with last:

/*        int [] x = {6, 2, 5, 3};
          int temp = x[0];

            x[0] = x[x.length-1];
            x[x.length-1] = temp;

        System.out.println(Arrays.toString(x));


*/







    }


}
