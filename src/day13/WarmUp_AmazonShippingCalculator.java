package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {

        String memberType = "Prime member";
        double amount = 45.99d ;
        int shippingFee = 0 ;

        if( memberType.equalsIgnoreCase("PRIME MEMBER"))  {

            System.out.println("YOU GET 1 DAY FREE SHIPPING");
            System.out.println("your final price is " + amount) ;

        }else if(amount > 25){
            System.out.println("NOT A PRIME MEMBER BUT YOUR ORDER IS MORE THAN 25");
            System.out.println("YOU GOT FREE SHIPPING ON AMOUNT " + amount);

        }else {
            System.out.println("DO YOU WANNA SIGN UP FOR PRIME MEMBERSHIP? ");
            shippingFee = 5;
            amount = amount + shippingFee;
            System.out.println("YOUR FINAL AMOUNT IS " + amount);
        }







    }
}
