package day15;

public class SubstringPractice {
    public static void main(String[] args) {
//                      0123456789012345
        String movie = "Lord Of The Ring";

 //       I want to get the word of from this movie
        String wordOf = movie.substring(5,7) ;
        System.out.println("wordOf = " + wordOf);


        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordOf);

        // get from the second word till last word ?
        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length() ;

        System.out.println("second word till last :" +movie.substring(startingPoint, endingPoint)      );


        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf =" + wordLordOf);

//         IF you want to stert from somewhere and just get the rest of the String
 //       above method will work, however there is even better method
  //      if you provide only one parameter to substring method
//        it will just start from that location and get till the end

        String secondToLast = movie.substring(5);
      //          1234567890123456
        // turn   Lord Of The Ring ---> Ring Of The Lord

        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12) ;
        String wordLord = movie.substring(0,4) ;

        System.out.println(wordRing + wordOfThe + wordLord);

        System.out.println(wordRing + wordOfThe + "Java " + wordLord);







    }
}
