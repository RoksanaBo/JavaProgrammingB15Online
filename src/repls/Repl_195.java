package repls;

import java.util.ArrayList;
import java.util.Scanner;

/*
The next two methods are .size() and .get().

If we have an ArrayList called someList and an Array called arr, these two pretty much do the same thing:
someList.size()
arr.length

In other words, .size() returns the length (size) of the list.

The method .get(i) will return the element found at index i.
The following two expressions also do the same thing:
someList.get(4)
arr[4]

On the left, given an ArrayList of Integers called ints,
find and return the sum of all the Integers in ints.
 */
public class Repl_195 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     ArrayList<Integer> ints1 = new ArrayList<>();

     sum(ints1);


    }


    public static int sum(ArrayList<Integer> ints){

        int sum = 0;
        for( Integer each : ints){

            sum+=each ;
        }

        return sum;
    }





}
