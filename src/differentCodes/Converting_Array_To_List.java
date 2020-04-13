package differentCodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Converting_Array_To_List {

    public static void main(String[] args) {



        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";
        
        String[] eachCharStrArray = str.split("");
        System.out.println("Arrays.toString(eachCharStrArray) = " + Arrays.toString(eachCharStrArray));

        List<String> charLst = Arrays.asList(eachCharStrArray);

        Set<String> charSet = new HashSet<>(charLst);
        System.out.println("charSet = " + charSet);

        // in one shot:
        Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charSetShortWay = " + charSetShortWay);



    }
}
