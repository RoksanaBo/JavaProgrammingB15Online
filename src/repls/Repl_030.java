package repls;

import java.util.Scanner;

public class Repl_030 {

    public static void main(String[] args) {


       String item1, item2, item3, report;
       double price1, price2, price3, totalPrice;
       int count1,count2,count3;

       Scanner scan = new Scanner(System.in);

       System.out.println("Enter Item1, count and its price:");
       item1 = scan.next();
       count1 = scan.nextInt();
       price1 =scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 =scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 =scan.nextDouble();

        double totalPrice1 =price1*count1;
        double totalPrice2 =price2*count2;
        double totalPrice3 = price3* count3;

        totalPrice = totalPrice1 + totalPrice2 + totalPrice3;

        if(count1>0){
            report ="Item1: " + item1 +" Price: "+ totalPrice1;
        }//else if(count2>0)







/*

-calculate totalPrice for all items only if the item's count is more than 0!
- Hint :
  The unit test assumes that item1 count is always more than 0
  The only situations you need to handle are either item2 count is 0 or item3 count is 0.
  Think simple and just handle the only item2 is 0 or  only item3 is 0 branches

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"
*/

    }
}
