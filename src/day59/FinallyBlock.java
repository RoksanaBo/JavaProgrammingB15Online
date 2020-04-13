package day59;

public class FinallyBlock {

    public static void main(String[] args) {


        // in some cases we want to run certain code
        // no matter exception happen or not
        // as part of try catch

        int[] nums = { 1,4,6 };

        try{
            System.out.println("nums[100] = " + nums[100]);
//        This is exactly what happen when above code get executed
//        an ArrayIndexOutOfBoundsException

//        throw new ArrayIndexOutOfBoundsException ( "Index 100 out of bounds for length 3");

        }catch (Exception e ){

            // how to get e.Message out of the exception object:
            // any exception object (can) have message field
            // and it can be extracted by calling getMessage method.

            System.out.println("Exception caught \n " + e.getMessage() );

        }finally {
            System.out.println("This code will always run no matter we have exception or not ");
        }


        System.out.println("The END");


    }
}
