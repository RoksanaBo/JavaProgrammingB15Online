package day25;

public class Turn_My_Name_Into_CharArray {

    public static void main(String[] args) {

        // pick up your own name and turn it into char array
        // and use for each loop to loop over them
        // optionally count how many "a" you have in your name

        String name = "Anastasiya";
        // turn thi into charArray using toCharArray() method of string
        char[] allCharsInName = name.toCharArray();

        for( char eachChar   :   allCharsInName) {
            System.out.println("eachChar = " + eachChar);
        }







    }
}
