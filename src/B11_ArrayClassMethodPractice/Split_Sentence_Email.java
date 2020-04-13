package B11_ArrayClassMethodPractice;

import java.util.Arrays;

public class

Split_Sentence_Email {

    public static void main(String[] args) {

        // split the String by the given value, and returns
        // it as String array


        String sentence = "Today is a great day Good day to learn java";



       String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        String email = "FirstName_LastName";
        String[] arr2 = email.split("_");

        String str = Arrays.toString(arr2);
        System.out.println(str.replace("[", "").replace("]", ""));

//-------------------------------------------------------------------------------------------
         String fullName = "Cybertek School Batch12";
        String[] array1 = fullName.split(" ");// there are 2 spaces
        System.out.println(Arrays.toString(array1));

//--------------------------------------------------------------------------------------------


    }
}
