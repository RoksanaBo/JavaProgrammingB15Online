package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        System.out.println("groceryPriceMap = "+ groceryPriceMap);
        // Map view --> keySet view, values view, entrySet view

        // how do I store all the keys into a Collection:
        // what do you think the data type will be to store such collection?
        // ----Set, because keys are unique.

        // we can use keySet() method of Map to get Set of keys:
        // this Set is connected with original Map,if you remove an item,
        // Map entry with this key will be also removed.

        Set<String> allNames = groceryPriceMap.keySet(); // да нам все key
 //       System.out.println(allNames);

 //       allNames.remove("Tomato");
 //       System.out.println(" remove tomato = " + allNames);

 //       System.out.println(groceryPriceMap); // without Tomato



        // what if we don't want such relationship and
        // we just want to use the keys somewhere else?
        // GET A COPY OF THE SET into different object.

        Set<String> namesCopy = new HashSet<>(allNames);  // скопировали весь groceryPriceMap
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);

        System.out.println("groceryPriceMap = " + groceryPriceMap);












    }
}
