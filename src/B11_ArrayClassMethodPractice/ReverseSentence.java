package B11_ArrayClassMethodPractice;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {


        String str ="Cybertek Batch Spartan is most hardworking Batch ever" ;
        String[]words = str.split(" "); // to get every word in sentence
        String reversedSentence= "";

        for (int j = 0; j < words.length ; j++) {

            String one = words[j];
            char[] wordChars = one.toCharArray();
            int lastIndex = wordChars.length-1;

            for (int i = 0; i <wordChars.length /2; i++) {

                char temp = wordChars[i];
                wordChars[i] = wordChars[lastIndex -i];
                wordChars[lastIndex-i] = temp;
            }
            // how to change char array to a String
            String reversed = new String(wordChars);
            reversedSentence = reversedSentence+   reversed + " ";

        }
        System.out.println(reversedSentence);





    }
}
