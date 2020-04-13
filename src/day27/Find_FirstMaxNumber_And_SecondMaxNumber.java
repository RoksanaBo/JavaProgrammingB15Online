package day27;

public class Find_FirstMaxNumber_And_SecondMaxNumber {

    public static void main(String[] args) {

        // write a program that returns maximum number from array.DO NOT use sort method

        int[] nums = {100, 10000, 9999, 8888,1231, 2345};
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(max < nums[i] ){
                max = nums[i];
            }
        }
        System.out.println("first maximum number = " + max);

        //Find second max number:

        int secondMax = nums[0];
        for(int i =0; i<nums.length; i++) {
            if(secondMax < nums[i] && nums[i] != max) {
                secondMax = nums[i];
            }
        }
        System.out.println("second max number = " + secondMax);










    }
}
