package repls;

import java.util.ArrayList;
import java.util.Scanner;

/*
The last ArrayList method we are going to learn is... .add() again!

Except this time, instead of .add() taking one parameter (the thing we want to add),
 this time, we will be giving it two parameters.  The two parameters are:
.add(i,element)
// i ==> the index you want to insert at
// element ==> the element you want to insert at index i

For example, if you had an ArrayList called nums with the values (4,2,5,6),
 and you run the following:
nums.add(1,100);
The result will be (4,100,2,5,6)

On the left, given an ArrayList of Strings called words, insert
 "hey" in the 0th index and then insert "yo" in the 3rd index.
 */
public class Repl_197_ArrayList_Add {

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    ArrayList<String> word = new ArrayList<>();
    test(word);
    }

    public static void test(ArrayList<String> words)
    {
       words.add(0,"hey");
       words.add(3,"yo");
        System.out.println(words);

    }


}
