package office_hour.Prac_2_11;

public class Parent extends Object{

    String name;
    int age;
    int SSN;



    //constructor:  is also a method, and we can overload it
    public Parent(){

        name = "This parent's name is unknown";
        age = -1;
        SSN = -1;
    }




    // overloaded constructor.
    //              local variables

    public Parent(String fullName, int age, int SSN) {
        name = name;
        this.age = age;
        this.SSN = SSN;
    }





    public void cookFood(String foodName){
        System.out.println("Cooking " + foodName);

    }




    // methods --> actions
    // void return
    // Ex : 1 User Story --> 3 test cases

    public static void hi(){
        System.out.println("Hi,how are you? ");
    }



    public static void hi(String name){

    }





//  with return type we promice to return one data type only
    public static String hello(){
       return"Hello hello ";
    }





// can we overLoad main method? YES
//   public static void main(){
//      }
//   public static boolean main(  int number ) {
//      }
    public static void main(String[] args) {

        // call void method
        hi();

        // call return method --> 2 ways to call it

        System.out.println( hello() ); // 1

        String greating = hello();  // 2
        System.out.println(greating);


        String word = "java";
        System.out.println(word.length() ); //

        int lengthOfWord = word.length();
        int number = 9;  // local variable, because it's inside the main method
        System.out.println(number);


    }




}
