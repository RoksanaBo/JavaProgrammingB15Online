package day15;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {

        String name = "Arya Stark";
        System.out.println( name.contains("st")    );

        // check if this name contains st no matter the case
        // i wanna store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase(); // "ARYA STARK"
        System.out.println("uppercaseName contains ST or not? "+ uppercaseName.contains("ST")    );

        String lowercaseName = name.toLowerCase(); // "arya stark"
        System.out.println("lowercaseName contains st or not ? " + lowercaseName.contains("st"));

        // METHOD CHAINING: combining multiple method call:
        // means--make my name all lowercase() then check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));
       // System.out.println(name.length().toUppercase());--> BAD IDEA






    }
}
