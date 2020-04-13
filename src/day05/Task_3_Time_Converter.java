package day05;

import java.util.Scanner;

public class Task_3_Time_Converter {

    public static void main(String[] args) {

        // Create an interactive program to ask user for day
        // and generate minute that day has

        Scanner sunday = new Scanner(System.in);

        System.out.print(" How many days do you need to count in minutes? ");

        int num = sunday.nextInt();
        int min = num * 1440;
        System.out.println( "Your answer is " + min + " minutes in "+ num + " days");




    }

}
