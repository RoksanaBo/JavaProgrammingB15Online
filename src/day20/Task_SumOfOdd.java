package day20;

public class Task_SumOfOdd {

    public static void main(String[] args) {


        // give me the sum of odd numbers from 10-100
        // use for loop 10-100
        // in each iteration check it's an odd number or not
        // if it's ,add that number to sum
        // print out sum value

        int sum = 0;

        for (int x = 10; x <=100 ; x++) {

            if(x % 2 == 1){
              //  System.out.print(x + " ");
                sum = sum+x;// sum+=x;
            }
        }
        System.out.println("sum = " + sum);





    }
}
