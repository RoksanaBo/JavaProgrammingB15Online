package B11_ArrayClassMethodPractice;

import java.util.Arrays;

public class ReverseWordInsideSentence {

    public static void main(String[] args) {



        String str ="Cybertek Batch Spartan is most hardworking Batch ever" ;
        String[] cyberTek = str.split(" "); // to get every word in sentence

        String one = "Cybertek";
        char[] wordChars = one.toCharArray();
        int lastIndex = wordChars.length-1;

        for (int i = 0; i <wordChars.length /2; i++) {
            char temp = wordChars[i];
            wordChars[i] = wordChars[lastIndex -i];
            wordChars[lastIndex-i] = temp;
        }

        System.out.println(Arrays.toString(wordChars));
        // how to change char array to a String
        String reversed = new String(wordChars);
        System.out.println(reversed);




/*      Variant 2:

        String str ="Cybertek Batch Spartan is most hardworking Batch ever" ;
        String[] cyberTek = str.split(" "); // to get every word in sentence

        String revString = ""; // to store reversed result

        for (int i = 0; i < cyberTek.length ; i++) {

            String word = cyberTek[i];
            String revWord="";

            for (int j =word.length()-1; j>=0 ; j--) {
                revWord = revWord+word.charAt(j);
            }
            revString = revString+revWord+" ";
        }
*/






    }
}
