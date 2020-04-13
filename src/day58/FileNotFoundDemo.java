package day58;
import javax.crypto.spec.PSource;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {

    public static void main(String[] args) throws Exception{


        // Throws keyword in java is used to declare that a method(or main method)
        // might throw exception. It does not handle the exception.For handling we need
        // to use try catch method.
        // benefut of throws:
        // helps our code to compile
        // if exceptions happen during runtime, code will stop and will not continue running

        // try catch: is used to handle an exception.
        // try block--> we put code that we want to protect from exceptions.
        // catch block -->s uded to catch an exception if it happens due to some line in try block.
        // If exception happens and gets cauht, code in catch block will run.
        // benefit: code will continue running until and without stopping due to exception.


        // A
        // try{
        //    B
        //    C
        // catch(Exception e){
        //    D
        //  }
        //   E

        // 1) No exceptions during runtime:  A, B ,C, E
        // 2) Exception at B during runtime: A, D, E
        // 3) Exception happened at C during runtime: A, B, D, E

        System.out.println("Before try catch");

        Files.readAllLines(Paths.get("file.txt"));



//       try {
 //           Files.readAllLines(Paths.get("file.txt"));
 //       } catch (IOException e) {
 //           System.out.println("Exception happened and caught");
 //       }

 //       System.out.println("after try catch");

    }



}
