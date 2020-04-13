package day08;

import java.util.Scanner;

public class WarmUpTask_2 {
    public static void main(String[] args) {


       /*Create a program to guess your favotite number
         create a variable called myFavoriteNumber as int
         ASk user to guess your favorite number
         if user guessed right 15 then print BINGO!!
         if not 15,print try again later

        */

       Scanner scan = new Scanner(System.in);

        System.out.println("guess my favorite number:");
        int myFavoriteNumber = scan.nextInt();

        if( myFavoriteNumber == 300){
            System.out.println("BINGO");
        } else {
            System.out.println("you are not my best frind , try again");
        }














    }
}
