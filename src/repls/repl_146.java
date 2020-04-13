package repls;

import java.util.Scanner;

public class repl_146 {
    public static void main(String[] args) {

 //       create a static method called "plus", its return is void and it gets no arguments.
 //       It asks the user to input two numbers, then it will add them and print the result.
 //       Create a scanner within plus method.

        plus();

    }
    public static void plus(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int num1=scan.nextInt();

        System.out.println("enter second number");
        int num2=scan.nextInt();

        System.out.println(num1+num2);
    }

}
