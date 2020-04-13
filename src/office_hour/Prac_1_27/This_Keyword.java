package office_hour.Prac_1_27;



class Test{

    public Test(){
        System.out.println("Hola");
    }


    public Test(String str){
        System.out.println(str);
    }



    public Test(int a ){
     //   Test();
        this();

        System.out.println("hello ");
    }




    public static void main(String[] args) {
        Test obj =new Test();


    }





}





 class This_Keywords {


    int a = 100;    // instance variable
    public void method1(){   // instance method


        System.out.println( this.a );  //calling instance variable

    }


    public void method2(){
        this.method1(); // instance method
    }


    public static void main(String[] args) {
      //  this.a; // there is no object instances in static method

      //  System.out.println(This_Super_Keywords .a);      a is not static

        This_Keywords obj = new This_Keywords();
        System.out.println(obj.a);
    }
}
