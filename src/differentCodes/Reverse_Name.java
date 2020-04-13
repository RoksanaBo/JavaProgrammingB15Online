package differentCodes;

public class Reverse_Name {

    public static void main(String[] args) {

        //             01234
        String name = "Akbar";
        // start from last character and print toward first character
        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));
        }
        System.out.println();






    }
}
