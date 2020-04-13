package differentCodes;

import java.util.ArrayList;
import java.util.List;

public class Print_Two_Items_AtA_Time {

    public static void main(String[] args) {


        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Vasyl");
        teamMates.add("Mike");
        teamMates.add("Asya");

        for (int x = 0; x <= teamMates.size()-2; x++) {// if we want to get 3--> teamMates.size()-3

            System.out.println("\t"+ teamMates.get(x) + " " + teamMates.get(x+1) );

        }


        System.out.println("----------------------------------------------------------------------------------");

        // print one at a time: 1-2, 3-4, ........

        for (int i = 0; i <= teamMates.size()-2; i+=2) {  //  i+=2 -----> to get neighbor items without repeating

            System.out.println("\t"+ teamMates.get(i) + " " + teamMates.get(i+1) );

        }





    }
}
