package day14;

public class LastIndexOf {
    public static void main(String[] args) {
        //             012345678901
        String name = "Game of Java" ;

       // find out last location the letter a shows up

        System.out.println(  name.lastIndexOf("a")    );

         // find out space
        System.out.println( name.lastIndexOf(" ") );

        System.out.println(  name.lastIndexOf("Ga") );

        System.out.println( name.lastIndexOf("Kawa") );

        // if I don't use contains method, what would be my condition to check
        // whether we have Kawa in this String, either using indexOf or lastIndex

        if( name.indexOf("Kawa") > -1    ) {
            System.out.println("Kawa found");
        }else {
            System.out.println("No Kawa");
        }



    }
}
