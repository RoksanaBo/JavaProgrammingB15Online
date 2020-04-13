package office_hour;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Prac_12_09 {

    public static void main(String[] args) {

        int num = 9;
        num = 15;
        System.out.println(num);

        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = num;
        nums[2] = 25;
        nums[2] = 22;
        // print info about array
        // toString()- method, that returns human readable information about array
        System.out.println(Arrays.toString(nums));
        System.out.println("How many numbers in array? " +nums.length);

        //when we want to get some value from array, we provide
        // index 1 it's an index of seconds value in array
        System.out.println(nums[1]);


 //       GET LAST VALUE FROM ARRAY:
        System.out.println(nums[nums.length-1]);

 //       GET MIDDLE VALUE
        System.out.println(nums[nums.length/2]);


        int[] newNums = new int[]{1, 3, 4, 5,7};














    }







}
