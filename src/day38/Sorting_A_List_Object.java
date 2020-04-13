package day38;

import java.util.*;  // daet dostup ko vsem packages.

public class Sorting_A_List_Object {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));

        // 2 ways to sort an ArrayList:
        // Use Collections utility class ( just like Arrays utility class for array objects)
        // Collections is a class coming from java.util package
        // it has a lot of ready method to work with Collection objects like ArrayList and so on

        Collections.sort(nums);
        System.out.println("sort numbers with Collections.sort = " + nums);

        // this version of sort method accepts two parameters:
        // 1 st is the list to be sorted
        // 2nd a Comparator Object that contains comparing logic
        // good news is there is ready method already in java
        // we can get reverse order comparator object by calling
        // Comparator.reverseOrder()  , just take it and use it !

        Collections.sort(nums, Comparator.reverseOrder() );  // comparator rabotaet kak Collections.sort
        System.out.println("sort numbers with Comparator.reverseOrder = " + nums);


        // List has sort method that accept one Comparator Object.
        // simple way to get Comparator objects is:
        // Comparator.naturalOrder() --> low to high order
        // Comparator.reverseOrder() --> high to low order

        nums.sort( Comparator.naturalOrder() );  // low to high order
        System.out.println("sort numbers with Comparator.naturelOrder() = " + nums);

        nums.sort( Comparator.reverseOrder()); // reverse order
        System.out.println("sort numbers with Comparator.reverseOrder() = " + nums);



    }
}
