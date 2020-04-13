package differentCodes;

public class ReturnTrueIf_String_ContainsNumber {

    public static Boolean checkIfStringHasNumber(String str){

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            if( Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }
        }
        System.out.println("no number found");
        return Boolean.valueOf(false);
    }
}
