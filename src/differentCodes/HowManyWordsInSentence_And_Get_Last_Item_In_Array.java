package differentCodes;

import java.util.Arrays;

public class HowManyWordsInSentence_And_Get_Last_Item_In_Array {

    public static void main(String[] args) {





        String sentence = "I love Java";

        String[] allWords = sentence.split(" ");

        System.out.println("allWords = "+ Arrays.toString(allWords) );
        System.out.println("how many words i have in this sentence?"+  allWords.length);


        //last word in sentence
        System.out.println("last word in this sentence = "+allWords[allWords.length-1]  );






    }
}
