package repls;
/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1,
and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the
words (in order) from wordList1, then add all the words (in order)
from wordList2.  In other words, it is combining all the elements
from the two parameters.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Repl_198_Combine_ArrayLists {

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        ArrayList<String> wordList3 = new ArrayList<>();
        ArrayList<String> wordList4 = new ArrayList<>();
        System.out.println(combineAL(wordList3,wordList4));
    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1 , ArrayList<String> wordList2){
        ArrayList<String> result = new ArrayList<>();
        result.addAll(wordList1);
        result.addAll(wordList2);
        return result;
    }
}
