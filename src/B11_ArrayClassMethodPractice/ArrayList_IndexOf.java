package B11_ArrayClassMethodPractice;

import java.util.ArrayList;

public class ArrayList_IndexOf {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // auto-boxing
        list.add(Integer.valueOf("33"));  // none
        list.add(Integer.parseInt("100")); // auto-boxing


        // indexOf(object) : returns index number of the arrayList

        // IF IT RETURNS NEGATIVE NUMBER, IT MEANS THE GIVEN OBJECT
        // IS NOT EXIST IN THE ARRAYLIST !

        // Ex: int a = list.indexOf(11)  //  -1
        int a = list.indexOf(1); // auto boxing
        System.out.println(a);




    }
}
