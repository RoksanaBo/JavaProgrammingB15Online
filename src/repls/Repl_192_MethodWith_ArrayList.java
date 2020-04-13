package repls;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * We will be manipulating elements of an ArrayList by using List methods.
 *
 * The first List method we will learn is .add()
 *
 * The following code will take an ArrayList of Strings called strs and add "Hello" to it.
 * str.add("Hello");
 *
 * The syntax follows something like:
 * arraylistvariable.add(data to add);
 *
 * In the space to the left, add three names (any names) to the ArrayList called names.
 */
public class Repl_192_MethodWith_ArrayList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names2 = new ArrayList<String>();

        System.out.println(names2);

    }

    public static ArrayList<String> test()
    {
        ArrayList<String> names = new ArrayList<String>();

        names.add("One");
        names.add("Two");
        names.add("Three");
        //write code below


        //leave below code alone
        return names;
    }

}
