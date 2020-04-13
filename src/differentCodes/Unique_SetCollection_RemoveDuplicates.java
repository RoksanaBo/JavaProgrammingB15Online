package differentCodes;

import java.util.HashSet;
import java.util.Set;

public class Unique_SetCollection_RemoveDuplicates {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signing page , once you signing with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        //

        Set<Character> charSet = new HashSet<>();// empty

        for (int x = 0; x < str.length(); x++) {
//           to find each and every character:
            charSet.add(str.charAt(x)); // adding v Set<Character> charSet=new HashSet<>();
        }
        System.out.println("How many characters overall ? = " + str.length());
        System.out.println("How many unique characters do we have =  " + charSet.size());// uniques count
        System.out.println("charSet = " + charSet); // unique





    }
}
