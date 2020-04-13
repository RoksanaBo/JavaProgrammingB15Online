package repls;

import java.util.Arrays;

/**
    Given a String variable email, write code using split method
 * to print email id and domain in separate lines.
 *
 * Example:
 * email -> info@cybertekschool.com
 * Print:
 * Email id: info
 * Email domain: cybertekschool.com
 * If email contains no @ character or multiple @ characters then print invalid email:
 *
 * email -> hello-gmail.com
 * print:
 * invalid email
 * email -> my@fancy@email.com
 * print:
 * invalid email
 */

public class Repl_119 {
    public static void main(String[] args) {



        String email = " myfancy@email.com";

        String[] s = email.split("@");
          System.out.println(Arrays.toString(s));



        if(s.length==2){
            System.out.println("Email id: " + s[0]);
            System.out.println("Email domain: " + s[1]);
        }else{
            System.out.println("invalid email");
        }



    }

}
