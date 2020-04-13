package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        String message = "I love Pumpkin , Pumpkin IS FUN!";

       message= message.replace("Pumpkin", "Java" );

        System.out.println(message);

      //  I want to replace space from everywhere
        String message2 = "Happy Thanks Giving to All";

    //    "Happy Thanks Giving to All!!"----->> "Happy Thanksgiving to All!!"

        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println("message2 = " + message2);


        // remove all the space
        String message3 = "TOMORROW IS OFF NO!" ;
     //   System.out.println(message3.replace());








    }
}
