package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Roksana";

        //how to store each and every character
        char[] namesChar = new char[  name.length() ];

 //       namesChar[0] = name.charAt(0);
 //       namesChar[1]= name.charAt(1);

        for(int x = 0; x<namesChar.length; x++) {
            //take each character of name and fill the char array values
            namesChar[x] = name.charAt(x);
        }
        System.out.println("namesChars = "  + Arrays.toString(namesChar));











    }
}
