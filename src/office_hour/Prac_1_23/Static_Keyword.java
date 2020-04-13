package office_hour.Prac_1_23;

class Test{


    public Test(String str){
        System.out.println("Name is " + str);
    }



    public static void method(){
        int a = 100;    // local variable
        System.out.println(a);

     //   Test obj1 = new Test();  object MUST be created with Existing constructor

    }



    public static void main(String[] args) {

        method();


     //   System.out.println(a);  a is a local variable,it cannot be created outside the class

        Static_Keyword.staticMethod2();

        Static_Keyword obj = new Static_Keyword();
        obj.staticMethod2();  // static is shared by all the objects of the class
                              // static should be called in static way : through the class name

        if(true){
            int b = 100; // I'm not able to use this int outside
                         // the if-block,because it is a local variable
        }
      //   System.out.println(b);  local variable cannot be used
      //   outside the method or blocks


        Test obj2 = new Test("Mohammed");  //   Name is Mohammed

    }

}



public class Static_Keyword {

    public static void staticMethod2(){
        System.out.println("This is static method");
    }



    String name;  // static variable
    static int stA = 10;

    int inB ;

    public static void main(String[] args) {

   //     System.out.println( Static_Keyword.name );
   //     System.out.println(name); // it gives compile error because name is not a class member

        Static_Keyword obj1 = new Static_Keyword();
        obj1.stA = 20;
        obj1.inB = 200;

        Static_Keyword obj2 = new Static_Keyword();

        System.out.println(obj1.stA); // 20
        System.out.println(obj2.stA); // 20

        System.out.println(obj1.inB); // 200
        System.out.println(obj2.inB); // 0

        System.out.println("---------------------------------------------------------------------------------------");


        Static_Keyword Gunel = new Static_Keyword();
        Gunel.name= "Gunel";

        Static_Keyword Yana = new Static_Keyword();

        System.out.println(Gunel.name); // Gunel
        System.out.println(Yana.name);  // Gunel

        //  method1();    not a class member

        Static_Keyword obj3 = new Static_Keyword();
        obj3.method1();

    }


    public void method1(){  // instance method
        System.out.println(name);
    }


}
