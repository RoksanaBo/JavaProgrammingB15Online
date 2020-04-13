package day33;

public class WarmUp_NameSpeller {

    public static void main(String[] args) {

        String spelledName = getSpelledName("Serra");
        System.out.println("SpelledName = " + spelledName);
        System.out.println(getSpelledName("Zeynep"));


    }
    // create a method getSpelledName
    // This method will put dash i between given String
    // for example---> Akbar----> A-k-b-a-r
    // @param name this is the name parameter
    // @return the name has dash in between

    public static String getSpelledName(String name){
       //
        String result = "";
        for (int x = 0; x <name.length() ; x++) {

            result=result+name.charAt(x);
            // concatenate dash(-)
            // if we are not at last character

            if(x != name.length()-1){
                result=result + "-" ;
            }

        }
        return result;

    }
}
