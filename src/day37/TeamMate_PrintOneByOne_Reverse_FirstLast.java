package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMate_PrintOneByOne_Reverse_FirstLast {

    public static void main(String[] args) {

 //   Create Arraylist of String and store
        // teamMates
        //print one by one
        //print reverse
        //print first last
        //print 2 at a time
        //concat everyone in one string separated by -

  //   ArrayList<String> teamMates = new ArrayList<>();
        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Vasyl");
        teamMates.add("Mike");
        teamMates.add("Asya");
        teamMates.add("Muhtar");
        teamMates.add("Maruf");

        System.out.println( teamMates);

        // first item :

        System.out.println("first item = " + teamMates.get(0)  );

        // last item: use last index---> size-1
        int lastItemIndex = teamMates.size()-1;
        System.out.println("last item = " + teamMates.get(lastItemIndex)  );

        // print one by one :
        System.out.println("\n all items: ");
        for (int x = 0; x < teamMates.size(); x++) {
            System.out.println("\tItem " +(x+1)+" = " + teamMates.get(x));
//         dobavili (x+1) chtob pronumerovat items
        }

        System.out.println("----------------------------------------------------------------------------------------");

        // reversed items :
        for (int x = lastItemIndex; x >=0; x--) {
            System.out.println("\tItem = " + teamMates.get(x));

        }

        System.out.println("------------------------------------------------------------------------------------------");

        // print two at a time: 1-2.2-3, 3-4.....

        for (int x = 0; x <= teamMates.size()-2; x++) {// if we want to get 3--> teamMates.size()-3

            System.out.println("\t"+ teamMates.get(x) + " " + teamMates.get(x+1) );

        }

        System.out.println("----------------------------------------------------------------------------------");

        // print one at a time: 1-2, 3-4, ........

        for (int i = 0; i <= teamMates.size()-2; i+=2) {

            System.out.println("\t"+ teamMates.get(i) + " " + teamMates.get(i+1) );

        }


        System.out.println("----------------------------------------------------------------------------------------");

        // Pair items by 3:
             // just print out outside the loop, if it's odd





        //  concat everyone in one string separated by -

        String result = "" ;
        for (int i = 0; i < teamMates.size(); i++) {

            result = result + teamMates.get(i) + "-";

            System.out.println( result);

        }



        System.out.println("---------------------------------------------------------------------------------------------");
        //  how to turn a List into String and Store it? and manipulate:

        String lstToString = teamMates.toString();
         System.out.println("lstToString after replacing  = \n\t"
                + lstToString.replace(", ", "-")
                .replace("[", "")
                .replace("]", ""));







    }
}
