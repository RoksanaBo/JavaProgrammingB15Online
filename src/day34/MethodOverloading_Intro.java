package day34;

import java.util.Arrays;

public class MethodOverloading_Intro {

    public static void main(String[] args) {

        System.out.println("Method overloading");
        System.out.println(12);

 //   Two versions of substring method:
//                     01234567890
        String name = "overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

//     Two versions of indexOf method (there are 4 )
        System.out.println( name.indexOf("di"));
        System.out.println(name.indexOf("o",2));

//      Arrays.toString() has 9 different versions to accept different parameters

 //     Method overloading:
 //     using same name and different parameter for different methods
 //     to reuse the name for similar actions
 //     IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

//       method name + parameter list = METHOD SIGNATURE

//      WE CANNOT HAVE 2 METHODS WITH SAME METHOD AND SAME PARAMETERS
//      Same method, but different parameters:
        sayHello();
        sayHello("Universe");
        sayHello("Denis");
        sayHello(100);
        System.out.println(  sayHello("Roksana", "Botcieva")   );
    }
    public static void sayHello(){
        System.out.println("Hello, World");
    }

    public static void sayHello(String name){
        System.out.println("Hello, " + name);
    }

    public static void sayHello(int num){
        System.out.println("Hello, " + num);
    }

 //   public static String sayHello(){
 //   this method is regarded as same method as above method


    public static String sayHello(String firstName , String lastName){

        return "Hello "+ firstName + " " + lastName;
    }




}
