package repls;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Repl_099_Prefix_Again {
    /**
     * Given a string, consider the prefix string made of
     * the first n chars of the string. Does that prefix
     * string appear somewhere else in the string?
     * Assume that the string is not empty and that n
     * is in the range from 1 till str.length().
     * <p>
     * Example:
     * input: abXYabc
     * input: 1
     * output: true
     * a appears twice
     * <p>
     * Example:
     * input: abXYabc
     * input: 2
     * output: true
     * ab appears twice
     * <p>
     * Example:
     * input: abXYabc
     * input: 3
     * output: false
     * abX appears once only
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;
        String str1 = str.substring(0, n);

        for (int i = 0; i <= str.length() - n; i++) {
            String currStr = str.substring(i, i + n);
            if(currStr.equals(str1) ){
                count++;
            }

        }
        System.out.println(count>1);


    }








    }

