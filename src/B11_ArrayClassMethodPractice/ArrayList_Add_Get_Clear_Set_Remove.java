package B11_ArrayClassMethodPractice;

import java.util.ArrayList;

public class ArrayList_Add_Get_Clear_Set_Remove {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();


       // add(object) :
       ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("apple");  // index:0, size: 1
        shoppingList.add("orange"); // index 1, size 2
        shoppingList.add("grapes"); // index 2, size 3

        System.out.println(shoppingList);


        // add(index, object) --> adds the object at the given index number
        //shoppingList.add("strawberry");
        shoppingList.add(1,"strawberry");
        System.out.println( shoppingList );

        shoppingList.add(4,"toyota"); // it does not skip indexes
        System.out.println(shoppingList);


        //-----------------------------------------------------------------------------------------------


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0,5); // [5]
        numbers.add(1,10);// [5,10]
        numbers.add(2,15);// [5, 10, 15]
        numbers.add(1,1);//  [5, 1, 10,15]

        numbers.add(1,6); //[ 5, 6, 1, 10, 15]

        System.out.println(numbers);

        //---------------------------------------------------------------------------------------------------



        ArrayList<String> names = new ArrayList<>();
        names.add("Roksana");
        names.add("Bars");
        names.add(1,"Sokrat");
        names.add(1,"Sarmat");
        names.add(0,"Sveta");

        System.out.println(names);

        // get(index number): returns the object
        String str1 = names.get(1);
        System.out.println(str1);


        // size() --> returns the length of arrayList as an Int value
        int length =names.size();
        System.out.println("size = " + length);

        for (int i = 0; i <names.size() ; i++) {

         String s= names.get(i);
            System.out.print(s+" ");

        }
        System.out.println();



        for(String each:names){
            System.out.print(each+" ");
        }
        System.out.println();


        // clear() : removes all objects from the arrayList :
        ArrayList<String> students = new ArrayList<>();
        students.add("Holly");
        students.add("Erhan");
        students.add("Nadira");
        students.add("Seyfo");
        students.add("Cihan");

        System.out.println(students);
        System.out.println(students.size()); // size is 5

        students.clear();
        System.out.println(students);
        System.out.println(students.size()); // now size is 0

      //----------------------------------------------------------------------------------------------------


       // set(index number, object):

       // the given object will replace the object
       // at the given index number.

       ArrayList<String> birds = new ArrayList<>();
       birds.add("Fehrat");
       birds.add("Lexi");
       birds.add("Asiya");  // Sveta
       birds.add("Alex");
       birds.add("Roksana");
       birds.add("Bars");

       System.out.println(birds);

       birds.set(2,"Sveta"); //
       System.out.println(birds);

      //---------------------------------------------------------------------------------------------------


      //contains(object) : checks if the given object is contained in the
      //                   ArrayList or not, and returns boolean value.

       ArrayList<String> googGuys = new ArrayList<>();
       googGuys.add("Hakan");
       googGuys.add("Bars");
       googGuys.add("Sokrat");
       googGuys.add("Sarmat");
       googGuys.add("Tim");

       System.out.println(googGuys);

       boolean result = googGuys.contains("Muhtar"); // false
       boolean result1 = googGuys.contains("Tim");    // true
       System.out.println(result1);

    //------------------------------------------------------------------------------------------------

       // equals(ArrayList) : checks if the two arrayLists are
       // equal or not, returns boolean value
       ArrayList<String> badGuys = new ArrayList<>();
       badGuys.add("Muhtar");
       badGuys.add("Asya");
       badGuys.add("replit");

       boolean result2 = badGuys.equals(googGuys); // false
       System.out.println(result2);

       if(googGuys.contains("Hakan")){
        System.out.println("Hakan is a good guy"); // true

       }


       // remove(int) : removes the index
       ArrayList<Integer> lists = new ArrayList<>();
       lists.add(1);  //  auto-boxing     index 0
       lists.add(2);  //  auto-boxing     index 1
       lists.add(3);  //  auto-boxing     index 2
       lists.add(4);  //  auto-boxing     index 3
       lists.add(5);  //  auto-boxing     index 4

       System.out.println(lists);  // [1, 2, 3, 4, 5] , size = 5

       lists.remove(1);
       System.out.println(lists);  //  [1, 3, 4, 5]
       System.out.println(lists.size()); // size = 4

       lists.remove(2);
       System.out.println(lists); // [1, 3, 5]
       System.out.println(lists.size()); // size = 3

        //----------------------------------------------------------------------------


        ArrayList<Integer> lists2 = new ArrayList<>();
        lists2.add(1);
        lists2.add(2);
        lists2.add(3);
        lists2.add(4);
        lists2.add(5);

        // [1, 2, 3, 4, 5]

        Integer a = 1;
        boolean r1 = lists2.remove(a);
        System.out.println(r1);  // [2, 3, 4, 5];

        //----------------------------------------------------------------------------------------


        ArrayList<String> city = new ArrayList<>();
        city.add("Miami");
        city.add("Miami");
        city.add("Gotham");
        city.add("Istanbul");
        city.add("Denver");
        city.add("Englewood"); // [Miami, Miami, Gotham, Istanbul, Denver, Englewood]


        // city.remove("Miami"); // [Miami, Gotham, Istanbul, Denver, Englewood]
        if(city.remove("Miami")){
            city.remove(2);// [Miami, Gotham, Denver, Englewood]

        }
        city.add(3,"Istanbul");
        System.out.println(city);


        //------------------------------------------------------------------------------------------

        ArrayList<Integer > price = new ArrayList<>();
        price.add(1); // auto-boxing
        price.add(2);
        price.add(3);
        price.add(4);
        price.add(5);

        price.remove( Integer.parseInt("2")); // parse method returns primitive
        System.out.println(price); // [1, 2, 4, 5]

        boolean r3 = price.remove( Integer.valueOf("3"));// valueOf returns wrapper class
        System.out.println(r3); // false because there is no 3























    }
}
