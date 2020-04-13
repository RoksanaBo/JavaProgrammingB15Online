package day59;

import java.io.IOException;

public class CheckedAndUnchecked {

    public static void main(String[] args) {

        String x = "abc";
  //      System.out.println( x.charAt(100) );

        // Exception Hierarchy:
        // Throwable --> child class --> Exception.
        // Under Exception class is one sub class known as RunTimeException.
        // Anything IS-A RunTimeException regarded as Unchecked Exception.
        // Unchecked Exceptions are not required to be handled at compile time.

        // How do we know the Exception is UncheckedException?
        // check whether it's a RunTimeException or sub class of RunTimeException.

        // try to throw the Exception programmatically,
        // if it compile it means it's RunTimeException.

        // throw  new RuntimeException("just throwing it out ! ");


        //Checked -> everything that sub class of Exception but not RunTimeException
        // programmers are required to handle (or declare) this type of exception.


        // is the class Exception a type of checked exception or unchecked?



    }
}
