package day18;

public class DoWhile_AtLeastRunOnce {

    public static void main(String[] args) {


        // WHILE LOOP  vs  DO WHILE LOOP :
        // while loop check the condition first then enter the statement
        // do while loop will take the action once then check the condition

        // do while loop run one iteration
        // while loop might not even run,or run many times,or forever

        int x = 1000 ;
        do {
            System.out.println("KEEP GOING!");

        }while ( x<5 ) ;

        System.out.println("THE END");



        while ( x<5 ) {
            System.out.println("keep going in while");
        }







    }
}
