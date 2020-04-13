package office_hour;


import java.util.Scanner;

public class Prac_1_6_repl162Fibonacci {

    public static void main(String[] args) {


        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();


        if (isPremiumCustomer == true) {
            if (nbooksPurchased >= 5 && nbooksPurchased <= 8) {
                System.out.println(1);
            } else if(nbooksPurchased >= 12) {
                System.out.println(2);
            }





        }
    }
}