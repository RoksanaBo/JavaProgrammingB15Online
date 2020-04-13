package B11_ArrayClassMethodPractice;

import java.util.ArrayList;

public class ArrayLis_tOfDouble_Task {

    public static void main(String[] args) {


        //create ArrayList of double
        // call it priceList
        // add 5 prices ;
        //try to get 3rd item
        // iterate over ArrayList using both loops
        // and print out

       ArrayList<Double> priceList = new ArrayList<>();
         priceList.add(1.2);
         priceList.add(10.12);
         priceList.add(1.4);
         priceList.add(1.5);
         priceList.add(1.6);

        System.out.println(priceList.get(2));

        for(int i=0; i < priceList.size(); i++)
            System.out.println( priceList.get(i));

        // for each loop:

        for( Double eachDouble : priceList)
            System.out.println(eachDouble);

        // in another loop
        //only print out price more than 10;

        for( Double eachDouble : priceList){

            if(eachDouble > 10){
                System.out.println( eachDouble );
            }
        }

        // Sum of all prices:
        double sum = 0;
        for( Double each : priceList){
            System.out.println(each);
            sum+=each ;
        }
        System.out.println(sum);

    }



}
