package day60.exception;

public class BreakTimeException extends RuntimeException {


}



class Main{
    public static void main(String[] args) {
     // Unchecked exception

     //        throw new BreakTimeException();

        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("My own checked exception!");
        }

    }
}