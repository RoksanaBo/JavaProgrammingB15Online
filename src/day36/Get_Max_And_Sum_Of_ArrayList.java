package day36;

import java.util.ArrayList;

public class Get_Max_And_Sum_Of_ArrayList {

    public static void main(String[] args) {


        ArrayList<Long> lst = new ArrayList<>();

        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);




        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS
        long sum = 0;
        for (int x = 0; x < lst.size(); x++) {
            sum = sum + lst.get(x); // x in here is index , so it's data type int
        }
        System.out.println("sum = " + sum);

        // TASK : GET THE MAX OF ABOVE ARRAYLIST ITEMS
        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {

            if (lst.get(x) > max) {
                max = lst.get(x);
            }

        }
        System.out.println("max = " + max);





    }
}
