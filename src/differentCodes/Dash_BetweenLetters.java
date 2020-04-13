package differentCodes;

public class Dash_BetweenLetters {
    public static void main(String[] args) {


            String name = "Tokun" ;
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i));
                // if I am not at last index then I print dash -
                if (i != name.length() - 1) {
                    System.out.print("-");
                }
            }
            System.out.println();

        }
    }

