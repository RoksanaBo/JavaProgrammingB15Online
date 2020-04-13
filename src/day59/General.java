package day59;

public class General {

    public static void main(String[] args) {


        // Object o = new String("abc");
        // can I get the first char using o
        // System.out.println(o.charAt(0)) ;

        System.out.println("Start");
      //    String str = null ;

        String str = "";

        // if you have multi try catch block,the most
        // specific type (child type) should come first,
        // the more generic type ( super type) should come last.

        try {
            System.out.println(str.charAt(0));
            System.out.println("End of try");

        }catch (NullPointerException bla ){
            System.out.println("No object here");

        }catch (Exception e ){
            System.out.println(e.getMessage());
            System.out.println("This is the rest of Exceptions");

        }

        System.out.println("End");




    }
}
