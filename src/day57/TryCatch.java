package day57;

public class TryCatch {

    public static void main(String[] args) {


        System.out.println("Before try catch: ");

        try {             //     это catch block


            System.out.println(" In try block");
            int result = 100 / 2;
            System.out.println("After 10 / 0 line");


        }catch(ArithmeticException e){

            System.out.println("Exception happen , and was handled ! ");
        }

        System.out.println("After try catch");


        System.out.println("-------------------------------------------------------");


        try{

            System.out.println("In second Try block");
            String str = "java is fun" ;
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));

        }catch (Exception e ){
            System.out.println("Exception happened in Try block and caught ! ");
        }

        System.out.println("After second Try Catch ");

    }
}
