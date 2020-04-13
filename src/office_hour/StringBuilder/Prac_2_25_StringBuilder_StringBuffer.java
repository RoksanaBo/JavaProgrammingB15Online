package office_hour.StringBuilder;

import javax.crypto.spec.PSource;

public class Prac_2_25_StringBuilder_StringBuffer {
    public static void main(String[] args) {


        // String -class in Java(immutable)
        // Heap -String Pool
        // String str1 = "abc";  ---> []
        // String str2 = "abc"; ---> [] they point at the same object.

        // str1 = "abcd" --->[]
        // str2 ? = abc

        // StringBuilder --> mutable
        // StringBuffer --> mutable, synchronized
        //
        // StringBuilder sb1 = new StringBuilder("word");
        // StringBuilder sb2 = sb1;
        // sb1 ---[word]
        // sb2 ---[]


        // sb1=new StringBuilder("java");
        // sb2 ?  = java

        // sb1 --- [java]
        // sb2 ---

        // If you know that you need to do some manipulations on String,
        // which class you will use?
        // StringBuilder or StringBuffer, depends if we need
        // any synchronization.

        // If we need to store some String we would always
        // want to use String class .

        // StringBuilder sb3 = new StringBuilder("selenium");
        // sb3--[selenium]
        // sb3 = sb3.reverse();
        // sb3 -- [muineles]

        // String str1 = "abc";  str1 --[abc]
        // str1 = str1.toUpperCase(); str1 [abc]< garbage collected
        //                            str1 -- [ABC]


        String str1 = "java";
        System.out.println(str1);

        String str2 = "java";
        System.out.println(str2);

        str1= "selenium";
        System.out.println("str1 after change: " + str1);
        System.out.println("str2 after change: " + str2);


        StringBuilder sb1 = new StringBuilder("html");
        StringBuilder sb2 = sb1;
        System.out.println("values of sb1 is - " + sb1 +" and sb2 is - " + sb2);

        sb1 = new StringBuilder("cucumber");
        System.out.println("values of sb1 is - " + sb1 +" and sb2 is - " + sb2 + " after change");


        StringBuilder sb3 = new StringBuilder("jenkins");
        StringBuilder sb4 = sb3;
        System.out.println("values of sb3 is - " + sb3 +" and sb4 is - " + sb4);
        sb3 = sb3.reverse();
        System.out.println("values of sb3 is - " + sb3 +" and sb4 is - " + sb4 + " after reverse");


        String word = "apple";
        StringBuilder word2 = new StringBuilder(word);
        word2 = word2.reverse();
        System.out.println(word2);





    }
}
