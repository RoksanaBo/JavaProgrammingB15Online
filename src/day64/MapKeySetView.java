package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetView {

    public static void main(String[] args) {



        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple"));
        // Map is not iterable,so we cannot directly iterate over them.
        // We can get something iterable out of the map
        // for example,keyset view will return a Set<String> and it's iterable
        
        Set<String> allNames = groceryPriceMap.keySet();
        
        for(String eachName : allNames){
            System.out.print("eachName = " + eachName);
            System.out.println(" | value is = " + groceryPriceMap.get(eachName));
        }








    }
}
