package day11;

public class ScoreChecker {
    public static void main(String[] args) {

        int score = 45;
        if(45<0 || 45>100) {  // mojno eshe zapisat' kak if(score<0 || score>100)
            System.out.println("Invalid Score!!!");

        }else if(45==100) {
            System.out.println("Perfect score");

        }else if(45>70 && 45<100) {
            System.out.println("You have passed!");

        }else if(45<20){
            System.out.println("Come to my office");

        }else if(45>30 && 45<40) {
            System.out.println("Attend additional classes");

        }else if(45>40 && 45<70) {
            System.out.println("Little bit more study will let you pass");

        } else {
            System.out.println("you have failed");


        }












    }

}
