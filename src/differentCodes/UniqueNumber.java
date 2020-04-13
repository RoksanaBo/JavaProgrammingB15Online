package differentCodes;

public class UniqueNumber {

    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 3,9,2, 3, 4, 4};// suda mojno i pribavit i drugie unique numbers


        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[j]);
            }
        }
    }
}