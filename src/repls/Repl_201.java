package repls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
 The original ArrayList should remain unchanged.
 */
public class Repl_201 {

    public static void main(String[] args) {


        Integer [] nums1 = {4,-6,3,-8,0,4,3};
        ArrayList<Integer> num3 = new ArrayList<>();

        System.out.println(appendPosSum(num3));

    }


        public static ArrayList<Integer>  appendPosSum(ArrayList<Integer> num) {

        Integer [] in = {1,2,-1,-2,3};


            for (int i = 0; i <in.length ; i++) {


            }





       return  num;
    }

}
