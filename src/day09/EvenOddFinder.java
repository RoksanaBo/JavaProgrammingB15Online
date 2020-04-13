package day09;

public class EvenOddFinder {
    public static void main(String[] args) {

        // Write a program to find out a number is even or odd
        // Create an int variable called myNumber and assign a value

        //If the number is even then says  this is a even number
        //If the number is odd then says  this is a odd number

        int myNumber = 301;

       // System.out.println(myNumber /2);
       // System.out.println(myNumber%2);

        int remainder = myNumber%2 ;

        //if( remainder ==0 ) {
        if(myNumber%2==0){
            System.out.println(" EVEN NUMBER !!!");
        }else{
            System.out.println(" ODD NUMBER !!!");
        }












    }
}
