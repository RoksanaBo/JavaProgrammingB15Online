package office_hour.Prac_2_18;

public class ExceptionReview {

    public static void main(String[] args)throws Exception {


        hi();
        test1();
        test3();

        // IDE
        // JAVA COMPILER
        int num = 9;
        // System.out.println(num) <--- my code doesn't compile


        // Exceptions:
        // 1. Compile time exception => checked exception .
        //    Right after you write code, JavaC (java compiler)
        //    checks syntax.


        // 2. Runtime Exception => unchecked. JRE JVM libraries
        //    run your code.


        // 2 ways to handle exception:
        // -->  try catch

        try{
            String word = "java";
            System.out.println(word.charAt(6));

        }catch (StringIndexOutOfBoundsException e) {  // 1
            System.out.println("Please take a look at index of the string");
         //    StringIndexOutOfBoundsException    for String Exceptions only!
        }catch (Exception e ){    //2
            System.out.println("mom exception catch it");
        }finally {
            System.out.println("this runs no matter what on the above ");
        }

//    when we run catch block ,is it general
//    to specific OR specific to general?
//    child to parent.

//  -->throws keyword:
//     mainly  used for methods.

//   --> throw keyword: it comes with new key word,
//       throw new exception.
    }

    public static void test1()throws Exception{
        String name = "Cybertek";
        System.out.println(name.charAt(20));
    }



    public static void hi() throws Exception {
        System.out.println("hi hi");
        test1();
    }


    public static void test2() throws ArithmeticException{
        // I write some code and I think it's relates to math,
        // and I want to throw ArithmeticException.

        throw new ArithmeticException(); // I am not handling, I'm throwing exception
    }


    public static void test3(){
        test2();
    }
}
