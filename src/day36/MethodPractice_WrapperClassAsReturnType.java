package day36;

public class MethodPractice_WrapperClassAsReturnType {

    public static void main(String[] args) {

        // write a static method to accept a String and return Boolean(Yes uppercase)
        // it should return true if the String contains at least one number
         Boolean result1 = checkIfStringHasNumber("ytz12ck");
        System.out.println(result1);

    }

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
