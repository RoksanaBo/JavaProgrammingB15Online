package differentCodes;

public class Get_Number_OutOf_String_ {

    public static void main(String[] args) {
        // toUpperCase, toLowerCase

        System.out.println("Is digit method practice");
        System.out.println( Character.isDigit('A') );
        System.out.println( Character.isDigit(' ') );
        System.out.println( Character.isDigit('6') );

        String str ="A34B123C4X";
        // get the number out of this string
        // and store it into Integer Variable num ;

        String numsIntStr = "" ;
        for (int x = 0; x <str.length() ; x++) {

//                isDigit accept char     eachChar
            if (Character.isDigit(str.charAt(x))) {
                System.out.println("str.charAt("+x+") = " +str.charAt(x) );
                // appearing number character to the result numsInStr
                numsIntStr += str.charAt(x) ;
            }
        }
        System.out.println(numsIntStr);
        // The requirements says get the result as Integer object
        Integer num = Integer.valueOf(numsIntStr);
        System.out.println(num);

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method




    }
}
