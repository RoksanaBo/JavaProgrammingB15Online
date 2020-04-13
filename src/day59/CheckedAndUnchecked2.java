package day59;

import java.io.IOException;

public class CheckedAndUnchecked2 {

    // checked exception must be handled of declared.
    // handle --> try catch
    // declare --> add it to the method signature to document.

    public static void main(String[] args) throws InterruptedException { // throws IOException {


        String x = "abc";
        System.out.println("start");

 //       try {
 //           throw new IOException("just throwing this away");

        Thread.sleep(3000);

 //       } catch (IOException e) {
 //            System.out.println("Exception caught");
 //       }

        System.out.println("end");






    }
}

