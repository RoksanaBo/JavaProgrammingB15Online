package day44;

public class Train extends Vehicle{  // sub class

// what is inherited from Super class
// fields and methods that visible to the sub class are inherited
// constructors are not inherited

//   String make;
 //   int year;

    int wagonCount;


     public void makeChoChoSound(){
         System.out.println("choo choo");
     }

    public static void main(String[] args) {

         Train t1 = new Train();
         t1.makeChoChoSound();

         // this attributes we've got from Vehicle
         t1.make = "Thomas";

         // t1.year = 1999; private is not inherited
         t1.setYear(1999);
         System.out.println(t1.getYear()  );


         // calling the method we got from Vehicle
         t1.start();
         t1.goForward();





    }










}
