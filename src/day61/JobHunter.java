package day61;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {


        Job_Comparable j1 = new Job_Comparable("GA", 120000, "BOFA");
        Job_Comparable j2 = new Job_Comparable("VA", 110000, "Amazon");
        Job_Comparable j3 = new Job_Comparable("VA", 150000, "Tesla");

        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2)); // 1, j1 is higher than j2
        System.out.println("j2.compareTo(j3) = " + j2.compareTo(j3));  // -1,  j2 is higher than j2

        System.out.println("-------------------------------------------------------------------------------");

        List<Job_Comparable> myFavJobs = new LinkedList<>();
        myFavJobs.add(new Job_Comparable("GA", 120000, "BOFA"));
        myFavJobs.add(new Job_Comparable("VA", 110000, "Amazon"));
        myFavJobs.add(new Job_Comparable("NY", 140000, "FaceBook"));
        myFavJobs.add(new Job_Comparable("CA", 150000, "Apple"));
        myFavJobs.add(new Job_Comparable("WA", 145000, "Microsoft"));

        System.out.println("myFavJobs before = " + myFavJobs);
        // How does the sort method know how to sort??
        // It use the comparing logic provided inside
        // compareTo(Job other) method
        // then sort them accordingly

        Collections.sort(myFavJobs);
        System.out.println("myFavJobs after  = " + myFavJobs);

        // Comparator.reverseOrder() will give you an
        // object with reversed comparing logic
        Collections.sort(myFavJobs, Comparator.reverseOrder());
        System.out.println("myFavJobs after 2 = " + myFavJobs);

        //  Collections.reverseOrder() will also give
        //  you an object with reversed comparing logic
        //  below code will try to sort the list
        //  in reverse order from natural order

        Collections.sort(myFavJobs, Collections.reverseOrder());
        System.out.println("myFavJobs after 3 = " + myFavJobs);


        // what's the difference between Collections.reverseOrder()
        // and Comparator.reverseOrder()
        // both of them will give you an Comparator object with reversed logic
        // they are just at two different place
        // one is the static method of Comparator interface
        // another is static method of Collections class
        // no functional difference at all , they happen to have same name


    }

}