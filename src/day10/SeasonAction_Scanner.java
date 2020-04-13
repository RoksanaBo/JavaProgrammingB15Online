package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("What is the season?");

        String season = scan.next();  // byte,short,int,char,String
        switch (season){

            case "spring":
                System.out.println("Easter,Blossom");
                break;
            case "summer":
                System.out.println("Swim,Vacation ,BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Harvest, Halloween");
                break;
            case "Winter":
                System.out.println("Christmas, New Year, Ski");
                break;
            default:
                System.out.println("Unknown");
        }










    }
}
