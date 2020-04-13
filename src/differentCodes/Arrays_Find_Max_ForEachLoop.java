package differentCodes;

import java.util.Scanner;

public class Arrays_Find_Max_ForEachLoop {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];

        for (int num : nums) {
            if( num>max   ) {

                max = num;  // kotorii salary bol'she tot ostaetsya,menshii
                // zamenyaetsya na bol'shii
            }

        }
        System.out.println(""+max);











    }
}
