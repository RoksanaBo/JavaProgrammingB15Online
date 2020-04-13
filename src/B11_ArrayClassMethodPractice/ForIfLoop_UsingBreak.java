package B11_ArrayClassMethodPractice;

public class ForIfLoop_UsingBreak {

    public static void main(String[] args) {


        int[] num = {5, 8, 3, 10, 53, 67};

        //  1. print false as long as one number is false

        boolean result = true;
        for (int i = 0; i < num.length; i++) {

            if (num[i] <= 10) {
                result = false;
                break;
            }
        }
        System.out.println(result);


        // 2. // print true if all numbers are more than 10, print false if not

        for (int x = 0; x < num.length; x++) {

            if (num[x] > 10) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }









    }
}
