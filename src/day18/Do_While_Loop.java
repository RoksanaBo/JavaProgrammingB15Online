package day18;

public class Do_While_Loop {

    public static void main(String[] args) {

        //  {} curly braces
        //  [] square bracket
        // () parenthesis
        // : colon
        // ! exclamation mark
        // & ampersand
        //  \ backslash
        // / forward slash
        //  ' single quote
        // " double quote


        //  count from 1 to 5 ;
      //  do {
        //  take some action here and repeat it
        // }while (some condition is true);

        int x = 1 ;

        do {
            System.out.println( x );
            ++x ;

        }while ( x<=5 ) ; // semi colon(;) is mandatory - obyazatel'nii

        System.out.println("_______________________");
        //  count from 5 to 1
        int y = 5 ;
        do {
            System.out.println(y);
            --y;
        }while (y> 0 );

        // WHILE LOOP  vs  DO WHILE LOOP :
        // while loop check the condition first then enter the statement
        // do while loop will take the action once then check the condition

        // do while loop run one iteration
        // while loop might not even run,or run many times,or forever










    }
}
