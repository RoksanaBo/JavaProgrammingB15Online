package repls;


import java.util.Scanner;
/**
 * In this task, you need to write 2 methods findMax() that
 * will find a maximum number in the array.
 * First method should work with array of integers (int[])
 * and return int, and second method should work with an
 * array of doubles (double[]) and return double as a result.
 * Methods must have the same name and different parameters.
 * Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
 *
 * Comment: Methods should be non static and with a return type.
 * Could not connect to the reCAPTCHA service. Please check your
 * internet connection and reload to get a reCAPTCHA challenge.
 */
public class Repl_188_Non_Static_With_Return {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Repl_188_Non_Static_With_Return r=new Repl_188_Non_Static_With_Return();

        int[] array = {scan.nextInt()};
        r.findMax(array);
        System.out.println(r.findMax(array));


        double[] array1 = {scan.nextDouble()};
        r.findMax(array1);
        System.out.println(r.findMax(array1));

    }
    public int findMax(int[] arr) {
            int maxInt = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (maxInt < arr[i]) {
                    maxInt = arr[i];
                }
            }
            return maxInt;
    }


        public double findMax(double[] arr) {
            double maxDouble = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (maxDouble < arr[i]) {
                    maxDouble = arr[i];
                }
            }
            return maxDouble;
        }



    }


