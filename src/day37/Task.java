package day37;

import java.util.ArrayList;
import java.util.List;

public class Task {

    public static void main(String[] args) {

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);

        System.out.println("lst2 " + lst2);

     // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

        int locationOf34Value = lst2.indexOf(34);

        lst2.add(locationOf34Value+1, 100);

        System.out.println("lst2 " + lst2);


        // add five 100 in front of 44:
        for (int i = 1; i <= 5; i++) {
            lst2.add(0,100);

        }
        System.out.println("lst2 " + lst2);









    }
}
