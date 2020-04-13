package day11;

public class Logical_Not_Operator {
    public static void main(String[] args) {

        // LOGICAL NOT OPERATOR ! exclamation mark used to negate the boolean value

        // IT CANNOT BE USED WITH ANY OTHER DATA TYPE OTHER THAN BOOLEAN

        // first we can use it directly to boolean value like true and false

        System.out.println( "result of ! true ");
        System.out.println( false );

        System.out.println("result of  ! false "); //pokajet false
        System.out.println( ! false );

        boolean isRecording = false;
        System.out.println("result of ! isRecording");
        //second YOU CAN USE IT IN FRONT OF A BOOLEAN VARIABLE AND IT WILL GIVE OPPOSITE VALUE
        System.out.println( ! isRecording   );

        // third you can use it in front of a boolean expression
        // boolean expression is any expression that result in a boolean value
        // for example : 7>5 , x>10, y==20, x<=100, x>y, x>10 &&x<100
        System.out.println("result of !(7>5) is  ");
        System.out.println( !(7>5)   );// eto false iz za !

        int x = 10;
        System.out.println(    !( x>10 )    );







    }
}
