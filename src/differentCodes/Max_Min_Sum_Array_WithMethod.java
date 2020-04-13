package differentCodes;

public class Max_Min_Sum_Array_WithMethod {

    public static void main(String[] args) {

        int[] scores = {2,5,8,23,4,5,6};

        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);
        compare2arraySize( new String[]{"Sezgin", "Senay", " Astrit"}, new String[] {"Araz"} );
        String[] names1 ={"Superman","Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg"};

    }

    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array

    // printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers


    public static void printMaxOfIntArray(int[] nums ) {

        int max = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(max<nums[i]){
                max = nums[i] ;
            }
        }
        System.out.println("max = " + max);

    }

    public static void printMinOfIntArray(int[] nums){
        int min = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("min = " +min);
    }

    public  static void printSumOfIntArray(int[] nums){

        int sum = 0;
        for(int each : nums){
            sum = sum + each;
        }

        System.out.println("sum = " + sum);

    }

    /*   compare2arraySize
         create a method that accept 2 String array object
         and compare the item counts inside these 2 arrays
         if arr1 is more then print array 1 has more item
         if arr2 is more then print array 2 has more item
         else print they have same item count
   */
    public  static void compare2arraySize(String[] arr1 , String[] arr2){

        if( arr1.length > arr2.length){
            System.out.println("array 1 has more item");

        }else if(arr1.length < arr2.length){
            System.out.println("array 2 has more item");
        }else {
            System.out.println("they have same item count");
        }
    }


}






