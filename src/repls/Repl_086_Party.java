package repls;

import java.util.Scanner;

public class Repl_086_Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 /*      Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
         Ask for the first guest name.
         Then ask does user want to enter one more guest.
         If yes - take input from.
         If not - finish the program and print list of the guests.

         Example of the program:

         Please enter guest name:
         Nick
         Do you want to enter new guest name:
         yes
         Please enter guest name:
         Linda
         Do you want to enter new guest name:
         no

         Guest's list: Nick, Linda
*/

        System.out.println("Please enter guest name:");
        String guestName=input.nextLine();

        System.out.println("Do you want to enter new guest name:");
        String answer =input.nextLine();

        while(answer.equalsIgnoreCase("yes")){

            System.out.println("Please enter guest name:");
            String name=input.next();

            guestName = guestName+ ", "+name;

            System.out.println("Do you want to enter new guest name:");
            answer=input.next();
        }
        System.out.println("Guest's list: "+guestName);



    }

}










