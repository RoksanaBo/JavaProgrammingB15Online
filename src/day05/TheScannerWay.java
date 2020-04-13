package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {


         // ask user for name
        // capture the result
        // print your name is
         // ask for birth year
        // print the age
         // ask user for height
         // and capture the result
         // print a height

        Scanner scan = new Scanner(System.in);
        // Scanner is data type, scan is the name,
        // new Scanner(System.in) is the value


        System.out.println("What is your name : ");

        String name = scan.next();
        System.out.println("Your name is  " + name );

        System.out.println("What is your birth year? ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;
        System.out.println("Your age is " + age);

        System.out.println("What is your heigh? ");
        double heigh = scan.nextDouble();
        System.out.println("Your heigh is " + heigh);




        /* Scanner is class that comes from JDK library
           We can use it to capture keyboard input from users
           The import statement must be between your package declaration
           and before the beggining of the class


            Getting single word as String                —> scan.next() ;
            Getting single number as int                 —> scan.nextInt() ;
            Getting single fractional number as double   —> scan.nextDouble() ;
            Getting single fractional number as float    —> scan.nextFloat() ;
            Getting single true or false as boolean      —> scan.nextBoolean() ;

         */









    }







}
