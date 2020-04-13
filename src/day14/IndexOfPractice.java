package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        // indexOf--->
        // find out index of another String inside This String


        //             012345678901
        String name = "Game of Java" ; // length is 12 ,last char index is 11
        // find out the location of Java
        // find out the location of letter o
        // find out the location of first space

        System.out.println(  name.indexOf("Java") );

        System.out.println(  name.indexOf("o") );

        System.out.println(name.indexOf("O") );  // = -1 potomu chto bolshoi bukvi O  nety v "Game of Java"

        System.out.println( name.indexOf(" ")  );



    }
}
