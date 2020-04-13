package day31;

public class Voting_Task {
    public static void main(String[] args) {

     checkEligibility(15);
     checkEligibility(23);
     checkEligibility(63);

     int yourAge = 12;
     checkEligibility( yourAge );

     //  can not access the method parameter outside of the method

    }


 //   This method has one int parameter named age
 //   Whoever calling this method, needs to provide a number
 //   It will set the value of age into that number
 //   The method parameter can be only accessible within the method

     public static void checkEligibility( int age ){

  //      int age = 15;

         if(age>18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible");
        }



    }



}
