package day27;

import java.util.Arrays;
import java.util.Scanner;

public class Task_Enter_Number_Five_Times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // ask user to enter a number 5 times
        //store those numbers into Array

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));


        for(int i=0; i<5 ; i++) {
            System.out.println("Enter an int number: ");
            int input = scan.nextInt();
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));













    }
}
