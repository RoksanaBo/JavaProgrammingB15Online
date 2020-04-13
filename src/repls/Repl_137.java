package repls;

import java.util.Scanner;

public class Repl_137 {

    public static void main(String[] args) {

        //Given a String variable sentence, write code to type each word in separate lines in a reverse order.
        //Example:
        //sentence -> "Java is fun"
        //Print
        //fun
        //is
        //Java

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] split = sentence.split(" ");


        String result = "";



        for (int i = split.length - 1; i >= 0; i--) {
            result += (split[i] + "\n");
        }
        System.out.println(result.trim() );



    }
}

