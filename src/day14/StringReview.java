package day14;

import java.util.Arrays;

public class StringReview {

    public static void main(String[] args) {

       String str = "I like Pumpkin";

        System.out.println( str.equals("pumpkin") );
/*     Contains:
        it takes whether a string exixts in another string
 */

        System.out.println("Does it contain Pumpkin: ");

        System.out.println(    str.contains("Pumpkin"));

        boolean gotPumpkin = str.contains("Pumpkin");

        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith endsWith :
        // check whether a string start with another string
        // check whether a string ends with another string
        // and return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);
        
        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);


        // PASSWORD VALIDATOR
        // minimum 8 characters,maximum 16 characters
        // it must contains   " _"  or  "$"
        // it must not contains space
        // it must start Ab

        // if any of above condition does not match,say"INVALID PASSWORD"
        // else  say "GOOD PASSWORD"

        String password = "ABC12345";
        // password.length() >=8 %% password.length()<=16

        //password.contains("$) || password.contains("_");

        // IT MUST NOT CONTAINS SPACE
        //   ! password.contains(" ");

        //IT MUST START Ab
        // password.startWith("Ab")






    }
}
