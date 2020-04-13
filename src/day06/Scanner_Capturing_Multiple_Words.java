package day06;

import java.util.Scanner;

public class Scanner_Capturing_Multiple_Words {
    public static void main(String[] args) {

        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address

        Scanner bla = new Scanner(System.in);

        System.out.println("What is your name? ");
       // nextLine(); method of Scanner is used to capture whole line
        String name = bla.nextLine();

        System.out.println("you have entered " + name);

        System.out.println("Which city do you live in, including state? ");
        String cityAndState = bla.nextLine();
        System.out.println("You entered city and state:" + cityAndState);

        System.out.println("What is your street adress? ");

        String streetAddress = bla.nextLine();
        System.out.println("You street address : " + streetAddress);








    }
}
