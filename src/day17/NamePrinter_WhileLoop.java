package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {

        String name = "Cybertek School Java Program ";

        int x = 0;
/*      in order to print each character of a String
        we need to start getting character
        from index 0 till last index ( name.length()-1;
 */

        while (x<name.length()) {     //   (x <= name.length()-1)
           System.out.print("index " + x + " : ");
            System.out.println(name.charAt(x) );
            ++x;
        }













    }
}
