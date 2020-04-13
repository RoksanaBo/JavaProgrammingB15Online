package repls;




import java.util.Arrays;
import java.util.Scanner;

public class Repl_125 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};

        System.out.println(Arrays.toString(str));
        String minValue=str[0];

       for(String eachStr:str){
           if(eachStr.length() < minValue.length()){
               minValue=eachStr;
           }

        }
        System.out.println( minValue);




        }













    }

