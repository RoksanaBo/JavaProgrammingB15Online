package day06;

import java.util.Scanner;

public class Sale_Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        Create a program to calculate the final discounted price of an Item

          Create 3 double variables  called  regularPrice , salePrice and discount

           Ask user question using scanner for regularPrice and discountPercentage
          And save the result into the variable

           Calculate sale price using above information
          For example :  80 regular price , 0.2 for discount  , salePrice —>> 64

            Print out  : regular price is 80$ , discount is 0.2  and your got deal for 64 $
            */


           // double regularPrice;
           // double salePrice;
          // double discount;

        // if you have variables with same data type , you can declare them in one line like this :
        double regularPrice, salePrice, discount;

        System.out.println("What's the regular price");
        regularPrice = scan.nextDouble();

        System.out.println("What is the discount rate ");
        discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount;

        System.out.println("regular price is " + regularPrice
                + "$ , discount is " + discount + "  and your got deal for " + salePrice + "    $");








    }


}

















