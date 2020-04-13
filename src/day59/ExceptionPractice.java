package day59;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        // this simple program will get certain character from Furkan's name
        // according to the index user provided
        System.out.println("The Start");
        String name = "Furkan";


        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get form Furkan's name? ");
        int targetIndex = scan.nextInt();

        try {
            System.out.println(name.charAt(targetIndex));

            // catch (Exception e ){ this is a general catch block than can catch any
            // exception IS-A sub type of Exception class.
            //Bellow will narrow down the catch block to only
            // catch StringIndexOutOfBoundsException () and take action accordingly

        }catch (StringIndexOutOfBoundsException e) {  //  Exception e = new  StringIndexOutOfBoundsException ();
             // getMessage is a method coming from Exception
            // class and provide some more details about exception object

            System.out.println("Message from getMessage method");

            System.out.println("Something unusual happen");
        }
        System.out.println("The End");




 //       System.out.println(" number 100 char ofe name is " + name.charAt(100));
 //       System.out.println("name = " + name);


//        Exceptions are objects, they have it's own class
//        and we can create object ourselves just like
//        we did from any other classes
//        StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
//        e1.toString();
 //       System.out.println( e1.toString()    );


    }
}
