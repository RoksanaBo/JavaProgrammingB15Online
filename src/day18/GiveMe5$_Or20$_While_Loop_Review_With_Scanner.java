package day18;

import java.util.Scanner;

public class GiveMe5$_Or20$_While_Loop_Review_With_Scanner {

    public static void main(String[] args) {

        // Keep asking for 5$ or 20$ until you get them


        Scanner scan = new Scanner(System.in);
        System.out.println("please give me 5 or 20");

        int x =scan.nextInt();

        // if the bill is not 5$ and not 20$
        // or negate the result of it's 5 or 20
        //  !( x==5  || x==20 )

     //   while(x!= 5  &&  x!=20){
        while ( ! (x==5  || x==20) ) {
            System.out.println("not the bill i'm looking for");
            System.out.println("please give me 5 or 20");
            x = scan.nextInt();

        }
        System.out.println("the happy end! got the money");

    }
}
