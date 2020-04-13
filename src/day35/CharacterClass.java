package day35;

public class CharacterClass {

    public static void main(String[] args) {

        // Character class has lots of static methods
        // to perform actions on char values
        // isDigit , isLetter, isLetterOrDigit, isUpperCase, isLowerCase
        // toUpperCase, toLowerCase

        System.out.println("Is digit method practice");
        System.out.println( Character.isDigit('A') );
        System.out.println( Character.isDigit(' ') );
        System.out.println( Character.isDigit('6') );

        String str ="A34B123C4X";
        // get the number out of this string
        // and store it into Integer Variable num ;

       String numsInStr = "" ;
        for (int x = 0; x <str.length() ; x++) {

//                isDigit accept char     eachChar
            if (Character.isDigit(str.charAt(x))) {
                System.out.println("str.charAt("+x+") = " +str.charAt(x) );

                // appearing number character to the result numsInStr
                numsInStr += str.charAt(x) ;
            }
        }
        System.out.println(numsInStr);
        // The requirements says get the result as Integer object
        Integer num = Integer.valueOf(numsInStr);
        System.out.println(num);

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method
        



    }
}
