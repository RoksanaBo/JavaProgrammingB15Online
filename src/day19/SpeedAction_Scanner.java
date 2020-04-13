package day19;

import java.util.Scanner;

public class SpeedAction_Scanner {

    public static void main(String[] args) {

        // create 2 int variables called start, end
        // create a for loop to stimulate slow increase of the speed

        // this is how we counted from 1 to 10
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting speed and ending speed: ");
        int start = scan.nextInt(); //15
        int end = scan.nextInt(); // 29

        System.out.print("you have started at speed---> ");

        for(int i = start; i <=end;  i++) {

            System.out.print(i + " , ");

        }
        // if start is less than end
        //the speed supposed to be increased 10,11,12,....

        // if start is more than end :
        //the speed supposed to be decreased
        //  45,44,43,42.....

        //  for(int i = start ; i>end; i--  )ili mojno --i   bez raznici





    }
}
