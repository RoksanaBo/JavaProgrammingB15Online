package repls;
/*
As an example, say you had an ArrayList called nums
with values (6,2,3,1,9,2,5).  Running the following code:
nums.remove(1);
will result in (6,3,1,9,2,5).
Running the following code again:
nums.remove(3);
nums.remove(3);
will result in (6,3,1,5), because after the first remove(3) is run,
the 2 and 5 get pushed up into the 3rd and 4th index, and then the
second remove(3) will remove the 2, leaving the 5.  Ask Mr. Murodil to
demonstrate this if you're still confused.

On the left, write code that will remove the first two elements in an
ArrayList of doubles (be careful, this is a little tricky!)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Repl_196_ArrayList_Remove_FirstTwoElements {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Double> dubs1= new ArrayList<>();



    test(dubs1);



    }


    public static void test(ArrayList<Double> dubs){





        dubs.add(1.0);
        dubs.add(2.0); // 1
        dubs.add(3.0); // 2
        dubs.add(4.0);
        dubs.add(5.0);

        System.out.println(dubs); // [1.0, 2.0, 3.0, 4.0, 5.0]

        dubs.remove(0);
        dubs.remove(0);
        System.out.println(dubs);


    }

}
