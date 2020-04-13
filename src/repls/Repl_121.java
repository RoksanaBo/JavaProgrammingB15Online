package repls;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_121 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Given an array nums, calculate count of even numbers in nums
        // (not their values!) and print out to console.
        int[] nums={2, 1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        int cntEven = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] % 2 ==0){
                cntEven++;
            }

        }
        System.out.println( cntEven);













    }
}
