package office_hour.Prac_1_8;

import java.util.ArrayList;
import java.util.List;

public class Return_ListOfCharacter {

    public static void main(String[] args) {
        
        // create a method that accept String object.
        // and return List<Character> that contains each character

        System.out.println( nameCharsToList("Sumeyye") );
        List<Character> resultList = nameCharsToList("Muge");

        resultList.add('M');
        System.out.println(resultList);

    }

    public static List<Character> nameCharsToList(String name){
        
        List<Character> charLst = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            charLst.add( name.charAt(i) );
            
        }
        return charLst;


    }
    
}
