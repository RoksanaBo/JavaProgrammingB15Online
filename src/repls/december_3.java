package repls;

import java.util.Scanner;

public class december_3 {
    public static void main(String[] args) {

        //HOMEWORK
        //Create an interactive program to ask user starting character and ending character
        //then print everything in between
        //it could be starting character is after ending character
        // for example user can enter Z A , OR A K
        // Ask user for String and pick character by charAt()

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st word with  single character to start with ");
        String first = scanner.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Enter 2nd word with single character to end with ");
        String second = scanner.next();
        char secondAsChar = second.charAt(0);

        // user enter A for first part
        // user enter C for second part
        // expected result should be A B C

        for(char iChar = firstAsChar ; iChar <=secondAsChar;  iChar++) {
            System.out.print(iChar + " ");
        }

        // user enter D for first part
        // user enter A for second part
        // expected result should be D C B A










    }
}
