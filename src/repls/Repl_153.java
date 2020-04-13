package repls;

import java.util.Scanner;


/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char



 */

public class Repl_153 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        String[] sSplit = info.split(",");

        System.out.print("person name: " + sSplit[0]+" ");
        System.out.print("last name: " + sSplit[1]+" ");
        System.out.print("age: " + sSplit[2]);


    }//end person

}
