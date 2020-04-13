package B11_ArrayClassMethodPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Converting_Arrays_Into_ArrayList {

    public static void main(String[] args) {


        Integer[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.add(100);

        System.out.println(list);


        //----------------------------------------------------------------------------------

        String[] arr2 = {"Java", "Python", "C++", "C#"};

        ArrayList<String> list2 = new ArrayList<>( Arrays.asList(arr2));

        // isEmpty(): checks if arrayList is empty, returns boolean expression

        System.out.println(list2.isEmpty()); // false

        list2.add("F");

        System.out.println(list2);





    }
}
