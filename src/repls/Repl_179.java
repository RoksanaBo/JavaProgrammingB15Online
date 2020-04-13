package repls;

public class Repl_179 {
    /**
     * uniqueChars is a method that you will code now,
     * should be able to accept any string in the world
     * and return unique characters from the parameter.
     * <p>
     * Examples:
     * <p>
     * uniqueChars("java") ==> "jav"
     * <p>
     * uniqueChars("mama") ==> "ma"
     * <p>
     * uniqueChars("spoon") ==> "spon"
     */




    public static void main(String[] args) {


        //test your code
        System.out.println(uniqueChars("wooden-spoon"));
    }

    public static String uniqueChars(String str) {


        String [] eachChar=str.split("");
        String result="";
        for (String each : eachChar) {
            if( !result.contains(each) ){
                result+=each;
            }
        }
        return result;

    }

}


