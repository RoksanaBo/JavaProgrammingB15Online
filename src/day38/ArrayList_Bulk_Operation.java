package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_Bulk_Operation {

    public static void main(String[] args) {

        // bulk operation - massovaya operasiya

        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        System.out.println(groceries);

        ArrayList<String> newGroceries = new ArrayList<>(groceries);
        newGroceries.add("Diet coke" );
        newGroceries.add("Sugar");

        System.out.println("new list = " + newGroceries);

        // actually i have list of items for you: Pasta, spinach, asparagus
        List<String> newItemsToAdd = Arrays.asList("Pasta", "spinach", "asparagus");

        // adding one list to another list :
        // we want to add all items inside newItemsToAdd to newLst:
        newGroceries.addAll(newItemsToAdd);

        System.out.println(newItemsToAdd);




        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

//---------------------------------------------------------------------------------------------------------
        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(2000);
        nums2.add(1000);

        // add all nums2 items into nums1

        nums1.addAll(nums2);
        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);


        // add 4 items to nums2 using addAll 100, 200, 300, 400
        nums2.addAll( Arrays.asList(100,200,300,400));
        System.out.println("nums2 after adding 4 numbers = " + nums2);











    }
}
