package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        // Create an ArrayList or Integer and fill it up with 1 to 100

        List<Integer>nums = new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {
            nums.add(number);
            
        }
        System.out.println(nums);
        
        
        // change all the odd numbers value to 0:
        // all odd numbers are at even index: 0,2,4,6...
        // so we can just work with those even index and set the value to 0 at those location
        for (int i = 0; i <nums.size() ; i+=2) {
            System.out.println("odd values are at index " + i);
            nums.set(i,0);
        }
        System.out.println("nums = " + nums);


        // Insert 100 to first index :
        nums.add(0, 100);
        System.out.println(nums);


        // how to find index of 20:
        System.out.println("index of 20 " + nums.indexOf(20));

        System.out.println("indx of 20 after inserting 100 at index 0 - " + nums.indexOf(20));
        


    }
}
