package B11_ArrayClassMethodPractice;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> numlst = new ArrayList<>();

        numlst.add(100);
        numlst.add(200);
        numlst.add(300);
        numlst.add(400);

        System.out.println( numlst );

        // inserting items at certain location
        // insert 500 as second item
        // add ( index, value)

        numlst.add(1,500);
        System.out.println(numlst);

        // if you try to access index does not exist
        // indexoutofbound exception.

        // Updating a value inside ArrayList item:
        // set( index, newValue)
        numlst.set(2, 1000);
        System.out.println(numlst);


        // deleting everything from the list:
        numlst.clear();
        System.out.println(numlst);


        // checking whether an item exists in the list
        // contain( item) ---> return boolean

        System.out.println( numlst.contains(1000));
        System.out.println( numlst.contains(3000));


        // finding out location of an item:
        int indexOf1000 = numlst.indexOf(300);
        System.out.println( indexOf1000);


         boolean isitEmptyOrNot = numlst.isEmpty();
        System.out.println(isitEmptyOrNot);



        // counting item:
        System.out.println( numlst.size());



        // removing item from arrayList

      //  numlst.remove( new Integer(300)); // remove second item
        numlst.remove(Integer.valueOf(300));
        System.out.println( numlst );



    }
}
