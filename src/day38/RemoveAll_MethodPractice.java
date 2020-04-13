package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll_MethodPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();

        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);

        System.out.println(nums1);

        // remove 100 and 300
        // just like addAll removeAll method expect another
        //collection\List Object to be removed

        nums1.removeAll(Arrays.asList(100,300));
        System.out.println(nums1);

        // now remove 100 and 1000   , we don't have 1000
        nums1.removeAll(Arrays.asList(100,1000));
        System.out.println(nums1);









    }
}
