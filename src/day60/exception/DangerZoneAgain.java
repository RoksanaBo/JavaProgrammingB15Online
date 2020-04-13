package day60.exception;
import java.io.FileNotFoundException;
public class DangerZoneAgain {
    //Handle or declare are ways to deal with checked exceptions.
    // If you are sure the method will never actually throw the exception
    // it's good to just declare it to go through compiler to make it happy
    // if there is actually a chance for the exception might left unhandled
    // it's good to wrap up under try catch


    public static void main(String[] args) throws InterruptedException {


        System.out.println("The start");
        try {
            // calling a method that declare to throws checked exception
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("Handling here! Just moving on! ");
        }

        // Thread class is coming from java.lang package
        // it has a method called sleep and it will let your program pause for x milliseconds

        Thread.sleep(3000);
        System.out.println("The end");

    }



    // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException from java.util package
    public static void readMyFile() throws FileNotFoundException {

        System.out.println("Reading the file in my computer");
        throw new FileNotFoundException("Kaboom ! file is not here !");

    }
}
