package day19;

import java.util.Scanner;

public class SpeedAction_StartEnd_Increasing_Decreasing {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting speed and ending speed: ");
        int start = scan.nextInt(); //15
        int end = scan.nextInt(); // 29

        System.out.print("you have started at speed---> ");

        if(start<end) {
            for(int i = start; i<=end ; i++) {
                System.out.print(i+",");
            }


        }else if(start>end){
            for(int x = start; x>end ; x--){
                System.out.print(x + ",");
            }


        }else {
            System.out.println("no action needed,same speed");
        }



    }

}
