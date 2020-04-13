package repls;
import java.util.Scanner;
/**
 * the method gets two strings and return the longest one
 *
 * biggerS("apple","orange") ==> "orange"
 */
public class Repl_185 {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        String a1 = scan.next();
        String b1 = scan.next();

        biggerS(a1,b1);
        System.out.println(biggerS(a1,b1));

    }


    public static String biggerS(String a ,String b){



String result="";

        if(a.length()>b.length()){
            result = a;
      //      System.out.println(result);
        }else if(a.length()<b.length()){
            result = b;
      //      System.out.println(result);
        }



    return result;
    }

}
