package office_hour.Prac_1_9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_ArrayList {

    public static void main(String[] args) {

        int[] arr = new int[5];

        List<Integer> list = new ArrayList<>();
        list.add( 10 ); // autobox  [10]

        list.add( 20); // autobox    [10,20]

        list.add(1,30);   // [10,30,20 ]

        System.out.println( list.size()); // 1

        int num = list.get(1);  // unboxing
        System.out.println(num);  // 20


        list.clear();
        System.out.println(list.size());  // 0


        System.out.println("------------------------------------------------------------------------------------");


        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.set(0,"B");

        System.out.println(list2);

        boolean result = list2.contains("C");
        System.out.println(result);


        list2.equals(list);


        System.out.println(list2.isEmpty());  // false

        list2.indexOf("B"); // 0
        System.out.println(list2.indexOf("B"));  // 0

        System.out.println( list2.indexOf("D"));  // -1 ,the given object is not exist in arrayList

        System.out.println("-----------------------------------------------------------");
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        // [1,2,3]

      //  int a=1;  //2

        Integer a2 = 1;
     //   list3.remove(a1); // [1,3]
       boolean r1 =  list3.remove(a2);  // [2,3]
        System.out.println(list3);

        System.out.println(r1); // true, 1 was removed from the arrayList


        List<String > list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");
        // [A,B,C,D]

        list4.remove(2);  // [A,B, D]
        list4.remove("B");  // [A,C,D]
        System.out.println(list4);



        Integer[] nums = {1,2,3,4,5,6,7,8};
        List<Integer> list5 = Arrays.asList( nums);
        System.out.println(list5);


        System.out.println("------------------------------------------------------------------------------");

        String[] students = {"Nursultan", "Irina", "Dulshat","Roksana"};

        List<String > names = new ArrayList<>( Arrays.asList(students)  );

        //  names.addAll(Arrays.asList(students));

        names.addAll( Arrays.asList("Mohamed", "Bulent","Mustafa") );

        System.out.println(names);

        System.out.println("---------------------------------------------------------------------------------");


        List<String > grades = new ArrayList<>();

        grades.addAll(Arrays.asList("A", "B", "A","C", "D", "E", "F"));

        grades.removeAll( Arrays.asList("A", "C"));

        System.out.println(grades); // [ B, D, E, F]

        System.out.println("----------------------------------------------------------------------------------");


        List<String> cars = new ArrayList<>();
        cars.addAll( Arrays.asList( "BMW", "Corolla", "Jaguar", "Honda", "Tesla"));

//    remove all cars that are not BMW,Jaguar,Tesla
        cars.retainAll(Arrays.asList("BMW","Jaguar", "Tesla"));  //removes all not-matching objects.

        System.out.println("-------------------------------------------------------------------------------");

        // remove all Ahmed:

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Eric", "Ahmed", "John", "Aaron","Ahmed"));

        System.out.println(employees);

        employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employees);

        System.out.println("----------------------------------------------------------------------------------");

        // remove all non-Ahmed:
        List<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmed", "Eric", "Ahmed", "John", "Aaron","Ahmed"));

        employees2.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employees2);

        System.out.println("----------------------------------------------------------------------------------------");



        List<Integer> nums2 = new ArrayList<>( Arrays.asList(9,8,7,6,5,4,3,2,1));

        Collections.sort(nums2);

        System.out.println(nums2);


    }
}
