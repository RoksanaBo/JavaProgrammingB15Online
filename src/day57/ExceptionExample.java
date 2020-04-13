package day57;

public class ExceptionExample {

    public static void main(String[] args) {


        System.out.println("Hello B15 Online Friends!");


     //   int num = 2.5 ;  COMPILE ERROR
        int[] nums = new int[3];  // 0,1,2
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
    //   nums[10] = 200;  // ArrayIndexOutOfBoundsException is thrown here.

    //    System.out.println("Bye Bye"); // this line does not run

        System.out.println("----------------------------------------------------------------------");



        int result = 10 / 0;
        System.out.println("result is " + result);
        // stack trace - стек, куча

        // parent class of all exception classes in java --> THROWABLE
        // Exception is an object
        // Throwable has 2 main direct subclasses:
        // Error--> OutOfMemoryError , StackOverFlow
        // Exception -->RuntimeException

        // Error VS Exception:
        // Error--> impossible to recover
        //      --> happen during runtime
        //      --> normally caused by environment where application is running
        // Exceptions: --> possible to recover from them( we can handle them)
        //             --> caused by programmer's code.


        // Exception has 2 types:
        //  1. checked exceptions:
        //   -   are exceptions that programmer MUST handle,
        //   -  otherwise code will not compile
        //   -  exceptions that is checked by compiler during compile time
        //  2. unchecked exceptions:
        //     - this exceptions happen during runtime and it is optional
        //       for a programmer to handle them
        //     - code will still compile even if programmer does not handle
        //     -these are also called RunTimeExceptions

        //Checked exceptions: are Throwable, Exception and all of its
        // subclasses, except RuntimeException.

        // UnCheckedExceptions: are RunTimeException class and

        // How to handle



















    }
}
