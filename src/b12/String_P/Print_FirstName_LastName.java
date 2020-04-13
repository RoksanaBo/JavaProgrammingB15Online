package b12.String_P;

import java.util.Scanner;

public class Print_FirstName_LastName {
    /**
     *
     *
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name and last name: ");
        String firstName = scan.nextLine().toUpperCase();
        String lastName = scan.nextLine().toUpperCase();

        // String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(lastName);
 //       fullName = fullName.toUpperCase();
        System.out.println("your full name is: " + fullName);








    }
}
