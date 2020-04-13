package day25;

import java.util.Arrays;

public class Find_Longest_Word_In_Sentence {

    public static void main(String[] args) {

        String sentence = "We All Love Java Coding intensively all the time";

        String[] allWords = sentence.split(" ");
        System.out.println("allWords =" + Arrays.toString(allWords) );


        int maxCharCount = 0;

        // first create a String variable longestWord to store my result
        // also create maxCharCount variable to store my longest char count
        // i want to go through each and every word in string array
        // and check whether the length of current word is more than longestWord
        //if it's I will assign the longest word value to current word i am looking at


        // assume the first word is the longest word before checking

        String longestWord = allWords[0];



        for (String currentWord : allWords) {



            //System.out.println("currentWord = " + currentWord);

            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }

        }

        System.out.println("longestWord = " + longestWord);


















    }

}
