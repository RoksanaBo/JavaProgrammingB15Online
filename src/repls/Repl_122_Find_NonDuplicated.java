package repls;

/**
 *
 Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

 Example:

 nums -> [1, 1, 2, 3, 4, 3, 4]
 2

 */
public class Repl_122_Find_NonDuplicated {

    public static void main(String[] args) {


       int[] num =  {1, 1, 2, 3, 4, 3, 4};


        for (int j = 0; j < num.length; j++) {
            int count = 0;
            for (int i = 0; i < num.length; i++) {

                if (num[i] == num[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(num[j]);
            }
        }


    }
}
