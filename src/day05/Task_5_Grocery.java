package day05;


import java.util.Scanner;

public class Task_5_Grocery {                             // Task 5 : Grocery Shopping
                                                         // ask user what the price of tomato is and store it
    public static void main(String[] args) {             // ask user how many tomato you want to buy and store it
                                                         // ask user what's the price of potato and store it
        Scanner boy = new Scanner(System.in);           // ask user how many bananas you want to buy and store it
        System.out.println("What is the price for tomato ");
        float potatoPrice = boy.nextFloat();                     // ask user whats the price of banana and store it
        System.out.println("how many you want to buy ");

        int potatoCount = boy.nextInt();
        System.out.println("your total for potato is " + (potatoPrice * potatoCount) );


        System.out.println("what is the price for potato");
        float potatoPrice2 = boy.nextFloat();
        System.out.println("how many potatoes do you want ? ");
        int potatoCount2 = boy.nextInt();
        System.out.println("your total price for potatoes is " + potatoCount2 * potatoPrice2);

        System.out.println("how many bananas do you want to buy?");                                                // ask user how many banana you want to buy and store it
        int bananaCount = boy.nextInt();
        System.out.println("what is the price of banana ");
        float bananaPrice = boy.nextFloat();
        System.out.println("your total price for bananas is " + (bananaPrice * bananaCount));





                                                         // generate this example output
    }                                                    // You got 3 potato price is 2.99 and total --->
}                                                        // You got 5 potato price is 3.49 and total --->
                                                         // You got 2 banana price is 1.99 and total --->

                                                         // Your grand total for this shopping is ????
