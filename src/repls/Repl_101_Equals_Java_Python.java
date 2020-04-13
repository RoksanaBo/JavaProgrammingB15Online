package repls;

import java.util.Scanner;

/**
 *
 * Given a string, print out true if the number of appearances
 * of "java" anywhere in the string is equal to the number of
 * appearances of "python" anywhere in the string (case sensitive).
 * Example:
 * input: We study java not python
 * output: true
 *
 * Example:
 * input: What's the difference between java, javascript and python?
 * output: false
 *
 *
 *
 */
public class Repl_101_Equals_Java_Python {

    public static void main(String[] args) {

        //    Scanner scan = new Scanner(System.in);
        //     String sentence = scan.nextLine();
//Given a string, print out true if the number of appearances of
// "java" anywhere in the string is equal to the number of appearances
// of "python" anywhere in the string (case sensitive).
//Example:
//input: We study java not python
//output: true
//
//Example:
//input: What's the difference between java, javascript and python?
//output: false

        String sentence = "What's the difference between java, javascript and python?";

        int countJava = 0;
        int countPython = 0;

        String s1 = "java";
        String s2 = "python";



        int index1=sentence.indexOf("java");

        while(index1!=-1){

            index1=sentence.indexOf("java",index1+1);

            countJava++;
        }
        System.out.println(countJava);




        int index2=sentence.indexOf("python");

        while(index2!=-1){

            index2=sentence.indexOf("python",index2+1);

            countPython++;
        }
        System.out.println(countPython);

        if(countJava==countPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }












    }
    }
