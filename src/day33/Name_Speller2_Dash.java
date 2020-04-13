package day33;

public class Name_Speller2_Dash {

    public static void main(String[] args) {



        System.out.println(getSpelledName2("Irina"));

    }


    public static String getSpelledName2(String name) {
        String result = "";
        // Keep adding dash until right before last character
        // then concatenate last character
        for (int i = 0; i < name.length() - 1; i++) {
            // this loop will add dash after each character
            // until 2nd character from the last
            result += name.charAt(i) + "-";
        }
        // YOUR CODE GOES HERE
        // result has everything but last character
        // so now we need to add last character back to the result
        return result + name.charAt(name.length() - 1);

    }
}
