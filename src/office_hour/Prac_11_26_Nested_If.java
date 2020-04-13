package office_hour;

public class Prac_11_26_Nested_If {

    public static void main(String[] args) {

/*        Nested if statement:
          IF STATEMENT UNDER ANOTHER IF STATEMENT
          Nested - one thing inside another thing

          pseudo code:
          you have option to buy food and dfink
          under food you can buy meal or snack
          under the drink you can buy soda or juice

          IF YOUR SELECTION IS FOOD:
          what kind of food do you want
          meal or snack
          IF YOUR SELECTION IS DRINK:
          what kind of drink?
          soda or juice?
  */
            String mainOptions = "Food";
            String secondaryOption = "meal";

            if(mainOptions.equalsIgnoreCase("food")) {
                System.out.println("You have selected food");

                if(secondaryOption.equalsIgnoreCase("snack")) {
                    System.out.println("You selected snack");

                }else if(secondaryOption.equalsIgnoreCase("meal")) {
                    System.out.println("you selected meal");
                }else {
                    System.out.println("no such food option");
                }
            }









    }
}
