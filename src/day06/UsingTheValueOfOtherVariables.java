package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);


        String yourOrder = "Gucci Bag";
        String myOrder = yourOrder;

        System.out.println("Your order is " + yourOrder + "\n" +
                              "My order is " + myOrder);










    }
}
