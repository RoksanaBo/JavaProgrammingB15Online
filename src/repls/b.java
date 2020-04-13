package repls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class b {

    public static void main(String[] args) {



        ArrayList<String> worldList1 = new ArrayList<>();
        worldList1.add("Sveta");
        worldList1.add("Roksana");


        ArrayList<String> worldList2 = new ArrayList<>();
        worldList2.add("Azamat");
        worldList2.add("Emi");

        Collection<String> names = new ArrayList<>();
        names.addAll(worldList1);
        names.addAll(worldList2);

        System.out.println(names);







    }
}
