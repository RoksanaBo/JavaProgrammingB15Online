package repls;

import java.util.Scanner;

public class Repl_107 {

    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
       digit1 = scan.nextInt();
       digit2=scan.nextInt();
        digit3=scan.nextInt();
        digit4=scan.nextInt();
        digit5=scan.nextInt();
        for (int i = digit1; i <digit5 ; i++) {
            System.out.println(i);
        }

        for (int i = digit5; i >digit1 ; i--) {
            System.out.println(i);
        }

    }
}
