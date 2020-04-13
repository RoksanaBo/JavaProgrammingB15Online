package differentCodes;

import java.util.Arrays;
import java.util.Scanner;

public class KakSdelat_Reverse_Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for(int i=0; i<nums.length/2; i++){

            int j= nums[i];

            nums[i] = nums[nums.length -i -1];

            nums[nums.length -i -1] = j;

        }
        System.out.println(Arrays.toString(nums));

    }
}
























