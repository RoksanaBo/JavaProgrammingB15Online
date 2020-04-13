package day33;

public class NumberAction {
    public static void main(String[] args) {

/**
 * getSumFrom1toX
 * This method should calculate the sum of
 * the numbers from 1 to the positive number user passed.
 * including the number itself
 *
 * @param x final number to be added
 * @return the sum of numbers from 1 to x as int
}
*/



        // 1 + 2 + 3 + 4 + 5 + 6 = 21
        System.out.println(getSumFrom1toX(6));

}

    public static int getSumFrom1toX(int x) {
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            sum += i; // sum = sum + i ;
        }
        return sum;
    }
}