package differentCodes;

import java.util.Scanner;

public class Arrays_Find_Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // yes above code will ask user 5 numbers while creating an array 
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and get the sum of the numbers


        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);










    }
}
