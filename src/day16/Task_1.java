package day16;

public class Task_1 {
    public static void main(String[] args) {


        // given a word with 4 characters
        //stored in a String variable word1
        //create a String variable called word2
        // store the reversed word1 into word2
        // and print out
        // FOR EXAMPLE:
        // word==> Java  ---> word2 avaJ

        String word1 = "Java";
        String word2 = "";
        // we need to take last character and put in first character
        // then put the second character at 1 location before first character
        // start getting character from last location till first location then save it

      //    word2 = "" +  word2 + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
      //    word2 = word2 + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
          word2 += word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);

        System.out.println("word2 = " + word2);

        // I want to add world at the end of it
        String msg = "Hello ";
            //   msg = msg + "World!" ;
               msg+="World!";
        System.out.println("msg = " + msg);







    }
}
