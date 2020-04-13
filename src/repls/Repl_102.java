package repls;

import java.util.Scanner;

/**
 * Write a program, that will read html variable and
 * output attribute value of id attribute (tag) into the console.
 * Input will be provided in a single line as outlined below.
 * If html variable doesn't contain <html> attribute, print
 * out into the console message: "Invalid input!".
 *
 * Example:
 * input: "C:\Program Files\Java\jdk-12.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.4\lib\idea_rt.jar=56463:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.4\bin" -Dfile.encoding=UTF-8 -classpath C:\production\JavaProgramming repls.Repl_102
 * output: myid
 */
public class Repl_102 {

    public static void main(String[] args) {


      Scanner scan = new Scanner(System.in);
        String html =scan.nextLine();
        for (int i = 0; i <html.length() ; i++) {
            System.out.println(i);
        }


String str = "<p id=\"myid\">";

        String subs = html.substring(str.indexOf("id=")+1,str.indexOf(">")-1);
        if(html.contains(str)){
            System.out.println(subs);
        }else{
            System.out.println( "Invalid input!");
        }


    }
}
