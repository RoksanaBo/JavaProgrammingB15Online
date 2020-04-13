package day06;

import java.util.Scanner;

public class Scanner_Capturing_One_Word {
    public static void main(String[] args) {

        Scanner bla = new Scanner(System.in);

        System.out.println("What is your name ?");

        String name = bla.next(); // it will only capture first word ( separated by space)

        //String anotherWord = bla.next();
        int age = bla.nextInt();


        System.out.println("You have entered name " + name);
        //System.out.println("Another word is " + anotherWord);
        System.out.println("You have entered age " + age);









    }
}
