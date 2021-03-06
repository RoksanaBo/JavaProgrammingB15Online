package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceList_Practice {

    public static void main(String[] args) {


        List<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);


        //  1. change the third price to 10 $
        // third item index = 2
        // and set method use index and new value as arguments when being called

        priceList.set(2, 10.0);
        System.out.println( "third item new value = "  +     priceList.get(2));


        // 2. Add 4 dollar to first price:your first price
        // value should be original price + 4:

        priceList.set(0, priceList.get(0) + 4 );
        System.out.println("added 4 dollars to first price = " + priceList.get(0));



        // 3. change last price to sum of first and second price
        Double sumOfFirstTwoItems = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1, sumOfFirstTwoItems);
        System.out.println("change last price to sum of first and second price= " + priceList);


        // 4. give 40% off to second price,do our new price should
        // be 40% less than original price which is 60%
        priceList.set( 1, priceList.get(1) * 0.6 );
        System.out.println("40% off to second price = " + priceList.get(1) ) ;


        // double the value of each and every price in the list:
        // this is how we do it for 1.

        // in order to update an item we need an index and new value
        // in order to double the price from the original, first we need to get the original value
        // then multiply by 2 and use that value for 2nd parameter of set method

        // now we do it for all of them  by replacing the index with variable

        // in order to update an item we need an index and new value
        // in order to update the first value index will be 0
        // in order to double the price from the original , first we need to get the original value

        // then multiply by 2 and use that value for 2nd parameter of set method
        // double newValue = priceList.get(0) * 2 ;
        // priceList.set(0 , newValue ) ;

        System.out.println("before doubling - " + priceList);
        for (int i = 0; i < priceList.size() ; i++) {

            double newVal = priceList.get(i) * 2;
            priceList.set(i,newVal);
        }
        System.out.println("after doubling" + priceList);



        // Cut the price into half if the price is more than 20$
        for (int i = 0; i <priceList.size() ; i++) {

            double eachPrice = priceList.get(i);
            if(eachPrice >= 20){
                priceList.set(i, eachPrice/2);
            }

        }
        System.out.println("priceList after cutting the price more than 20 =\n\t" + priceList);



        // swap the first value with the last value:
        int lastIndex = priceList.size()-1;
        Double temp = priceList.get(0); // store the first value in temp so we can assign it to the last later
        priceList.set(0, priceList.get(lastIndex)) ;// assign the last value to the first index
        priceList.set(lastIndex, temp);   // assign the saved first value into the last index

        System.out.println("priceList after swapping first and last value : \n\t" + priceList);







    }
}
