package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {

    public static void main(String[] args) {

        System.out.println("Start");
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get form Furkan's name? ");

        // we want to take different action according to
        // different type of exception happen during the program
        // we can have more than one catch block
        // to handle different types of exception
        //and take action according to the exception type at runtime

        try{
            int targetIndex = scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            System.out.println("end of try");

        }catch (StringIndexOutOfBoundsException e ){
            //  StringIndexOutOfBoundsException e = new InputMismatchException();

            System.out.println("You are out of bound! ");
            System.out.println("Enter between 0 and " + name.length() );

        }catch (InputMismatchException bla){
            System.out.println("Input mismatch, enter number");
            System.out.println("Here is what you get if you enter 0 " + name.charAt(0));
            //
        }catch (Exception e){
            System.out.println("If I don't catch above 2 types I will come here");
        }

        System.out.println("The End");
    }
}
