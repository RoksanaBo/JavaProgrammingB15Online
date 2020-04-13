package day59;

public class ThrowingExceptionProgrammatically {

    public static void main(String[] args) {


      //  NullPointerException e1 = new NullPointerException();

        NullPointerException e2 = new NullPointerException("Back to earth");
        System.out.println( e2.getMessage());

      // how do we programmatically throw exception myself?
      // we use throw keyword followed by exception object
      // (or the variable that point to the exception object)

        throw e2 ; // THROW is a keyword that has one purpose
                   // of throwing the exception to the runtime


        // throw and throws means completely different things,

        // THROW keyword can be used to programmatically
        // throw the exception to the runtime
        // to control the program flow




    }
}
