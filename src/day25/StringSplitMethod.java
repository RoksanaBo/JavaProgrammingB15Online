package day25;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {


        String sentence = "I love Java";

        //WHAT DOES IT DO?
        //

        //DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD?
        //

        //



        String[] allWords = sentence.split(" ");

        System.out.println("allWords = "+ Arrays.toString(allWords) );
        System.out.println("how many words i have in this sentence?"+  allWords.length);

        //last word in sentence
        System.out.println("last word in this sentence = "+allWords[allWords.length-1]  );

        // ARE WE LIMITED TO SPLIT BY SPACE OR WE CAN SPLIT BY ANYTHING??
        //by anything!!!

        String sentence2 = "Everything is Awesome!!!";
        //split by "e"
        String[] splitBy_e_Array = sentence2.split("e");
        System.out.println("splitBy_e_Array" + Arrays.toString(splitBy_e_Array));

        for(String eachPeaces :  splitBy_e_Array ){
            System.out.println("eachPeaces = < " + eachPeaces+ ">");
        }



















    }
}
