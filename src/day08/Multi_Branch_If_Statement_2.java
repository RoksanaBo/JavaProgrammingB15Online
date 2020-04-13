package day08;

public class Multi_Branch_If_Statement_2 {
    public static void main(String[] args) {

        //given your currentSpeed , speedLimit
        //check whether the current speed is

        //more than 90  -->> jail
        //more than 80 and less than or equal 90  --> reckless driving
        //more than 70 and less than or equal 80  --> point take
        // more than 60 and less than or equal 70  --> warning
        // if not speeding keep driving

        int currentSpeed = 65;

        if(currentSpeed >90) {
            System.out.println("Jail Time");
        } else if(currentSpeed >80) {
            System.out.println("reckless driving");
        } else if(currentSpeed > 70) {
            System.out.println("point taken");
        } else if(currentSpeed > 60) {
            System.out.println("warning");
        } else {
            System.out.println("KEEP DRIVING");
        }










    }





}
