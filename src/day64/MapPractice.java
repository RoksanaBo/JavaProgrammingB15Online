package day64;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {


        // what if we want to have multiple value for one key?
        // Ex: groupCode (bugHunter) -- group member names:
        // String     List<String>

        // key data type is String, value data type is List<String>

        Map<String, List<String > > groupMap = new HashMap<>();

        groupMap.put("PowerOf4", Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupMap.put("Achievers", Arrays.asList("Maiia","Anastasia","Zaki","Toyly","Like")  );
        groupMap.put("BugHunter", Arrays.asList("Ayse","Rabiam","Gulzina"));
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyra","Huvaida"));

        System.out.println("groupMap = " + groupMap);

        groupMap.forEach((groupCode,allMembers)->System.out.println("groupCode = " + groupCode + "\n\tmembers : " + allMembers));

        // get Toyly, he is at index 3
        System.out.println(groupMap.get("Achievers").get(3)    );


        // check whether this map has Gulzina or not in BugHunter?
        // get method from Map | contains method is coming from list
        // because the value are List<String> get method will return the entire List

        System.out.println( groupMap.get("BugHunters").contains("Gulzina"));

        // we want to add a group entry so we can add or remove members from the group.

        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "Batman", "WonderWoman")));
        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice Ligue"));

        // the key for the Map should be Immutable
















    }
}
