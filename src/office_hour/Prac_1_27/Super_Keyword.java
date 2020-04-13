package office_hour.Prac_1_27;

class TestData{

  public TestData(int a ){
      System.out.println("A");
  }
  int a = 100;

  public void method1(){
      System.out.println("super class instance methods");
  }

}


public class Super_Keyword extends TestData{

    public Super_Keyword(){
     //   super();  // constructor from super class, "A"
        super(10);
        System.out.println("B"); // prints "B"

    }


    public void method1(){
        System.out.println("sub class instance methods");
    }


    public static void main(String[] args) {

     //   super.a = 300;
     //   super.method1();
        // mm();

        Super_Keyword obj = new Super_Keyword();
        obj.mm();
    }

    public void mm(){
        System.out.println( super.a);//  calling instance variable
        this.method1(); // calling instance method from super class
    }


    public void mm2(){
        System.out.println( super.a);
        this.method1();  // calling instance methods from current class
    }

}
