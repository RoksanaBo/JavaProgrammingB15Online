package day31;

public class MethodWithParameter_SeasonChecker {

    public static void main(String[] args) {


       decideSeasonAction("Winter");
       decideSeasonAction("Summer");

        // a string variable declared and assigned value inside main method
        // It can be accessible in main method

       String mySeason = "aaaaa" ;
       decideSeasonAction(mySeason);

        System.out.println("aaaaa");// you can directly pass aaaaa to the method
        System.out.println(mySeason); // or you can pass a variable that has value aaaaa to the method

    }

    // write a static method called  decideSeasonAction
    // It has one String parameter called season
    // Inside method method:
    //  according to what user passed it should print correct action

    public static void decideSeasonAction( String season) {
        // season method parameter can only be accessible inside method body

        switch (season){

            case"Spring" :
                System.out.println("Hiking");
                break;
            case"Summer":
                System.out.println("Swimming");
                break;
            case"Fall":
                System.out.println("Pumpkin picking");
                break;
            case"Winter":
                System.out.println("Snowboarding");
                break;
            default:
                System.out.println("invalid season");

        }





    }
}
