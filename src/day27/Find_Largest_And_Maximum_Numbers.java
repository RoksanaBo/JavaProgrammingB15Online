package day27;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Largest_And_Maximum_Numbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

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

        //FIND LARGEST NUMBER
        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length-1];
        System.out.println("Largest number is: " + largestNumber);

        // FIND MIN NUMBER:
        int minNumber = numbers[0];
        System.out.println("minimum number is = " + minNumber);









    }
}
