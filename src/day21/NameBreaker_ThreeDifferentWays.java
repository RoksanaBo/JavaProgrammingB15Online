package day21;

public class NameBreaker_ThreeDifferentWays {

    public static void main(String[] args) {

       /*Store your name into a variable name
       loop through each and every letter
       and print
       if you see letter b --> get out of the loop
        */     //     012345678
       String name = "Nursultan";

       for (int x = 0 ; x<name.length() ; x++ ) {

           char currentChar = name.charAt(x) ;
           System.out.println( currentChar );
           if(currentChar=='l') {
               System.out.println("Found it!");
               break;
           }
       }


        for (int x = 0; x < name.length(); x++) {

            String currentChar = name.substring(x, x + 1);

            if (currentChar.equalsIgnoreCase("l")) {
                System.out.println("FOUND IT !!");
                break;
            }
            System.out.println(currentChar);

        }


        // OPTIONALLY CHAIN THE METHOD WITHOUT SAVING EACH CHAR
        for (int x = 0; x < name.length(); x++) {

            if (name.substring(x, x + 1).equalsIgnoreCase("l")) {
                System.out.println("FOUND IT !!");
                break;
            }
            System.out.println(name.substring(x, x + 1));

        }







    }
}
