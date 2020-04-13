package day10;

public class Calculator {
    public static void main(String[] args) {

        //create a variable
        //use a variable called operator with type char
        //use switch statement to do following logic

        char operator = '+';
        switch (operator){
            case'+':
                System.out.println("You are about to add numbers");
                break;

            case'-' :
                System.out.println("You are able to subtract");
                break;
            case '*':
                System.out.println("You are about to multiple numbers");
                break;
            case '/':
                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("invalid operator");

        }









    }
}
