package differentCodes;

import java.util.Scanner;

public class Nested_If_WithScanner {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("YOU WANT FOOD ? SAY FOOD IF YES ");
        String mainOptions = scan.next();




        if (mainOptions.equalsIgnoreCase("food")) {

            System.out.println("You have selected food ");

            System.out.println("you want meat or snack?");
            String secondaryOption = scan.next();

            if (secondaryOption.equalsIgnoreCase("snack")) {

                System.out.println("YOU HAVE SELECTED SNACK");

            }else if (secondaryOption.equalsIgnoreCase("meal")) {

                System.out.println("YOU HAVE SELECTED MEAL");

            } else {
                System.out.println("NO SUCH FOOD OPTION");



            }



        }







    }
}
