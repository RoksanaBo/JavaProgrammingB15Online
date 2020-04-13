package day08;

public class Multi_Branch_If_Statement {

    public static void main(String[] args) {

        /*
        given your currentSpeed , speedLimit
        check whether the current speed is
         more than 90 --->> jail
         more than 80 and less than 90 ----> reckless driving

         ---------START FROM HERE---------
         more than 70  ---> point taken
         more than 60 and less than 70 --> warning

         if not speeding keep driving

         */
        int currentSpeed = 45;
        int speedLimit = 60;
        // start top to buttom

        if( currentSpeed > 70 ) {
            System.out.println("you are speeding more than 70 -- POINTS TAKEN!!!");
            // asking whether its less than or = 70 and more than 60
            // when you come to this point , your speed is already not more than 70

        } else if ( currentSpeed > 60) {
            System.out.println("your speed is less than or equal 70 but more than 60");
        } else {
            System.out.println("KEEP DRIVING YOU ARE GOOD!!!");
        }











    }

}
