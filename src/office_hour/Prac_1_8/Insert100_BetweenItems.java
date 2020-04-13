package office_hour.Prac_1_8;

import java.util.ArrayList;
import java.util.List;

public class Insert100_BetweenItems {


    // an ArrayList of Integer object
    // Insert 100 between items.
    //                                                 list of Integer
    public static void insert100BetweenItemsOfList( List<Integer> numbers){

        for (int x = 1; x < numbers.size() ; x+=2) {
            numbers.add(x,100);
        }



    }



    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(7);

        /*
        System.out.println("numbers = " + numbers);

        numbers.add(1,100);
        System.out.println("numbers = " + numbers);
        
        numbers.add(3,100);
        System.out.println("numbers = " + numbers);
        
        numbers.add(7,100);
        System.out.println("numbers = " + numbers);
*/

        // call the method and print it out:
        insert100BetweenItemsOfList(numbers);
        System.out.println("numbers after inserting = " + numbers);



    }
}
