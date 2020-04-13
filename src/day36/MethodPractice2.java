package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {


        long[] myLongs = {6L, 11L, 44L, 32L, 65L};
        System.out.println(Arrays.toString(myLongs));

        swapFirstAndLastValue(myLongs);
        System.out.println(Arrays.toString(myLongs));

        long[] myNums1 = new long[5];
        System.out.println("myNums1 = " + Arrays.toString(myNums1));

        String[] names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));

        //       String str = "abc" ;
//        String str2 = null ;

        int x = 0;
        Integer x1 = null;

        // ONE THING THAT PRIMITIVE VARIABLES CAN NOT DO IS :
        // WE CAN NOT ASSIGN IT TO NULL
        // ANY NON-PRIMITIVE VARIABLES (REFERENCE VARIABLES )
        // CAN ASSIGNED TO NULL VALUE
        // TO DEFINE , IT'S NOT POINTING TO ANY OBJECT YET
    }

    /**
     * Swamp first and last value of long array
     *
     * @param nums long array
     */



//    write a static void method to accept a long array.
//    It should swamp first value with last value of the array

    public static void swapFirstAndLastValue(long[] nums){

        //first element = nums[0]
        // last element = nums.length-1;

        // just like swapping the tea in cup with coffee in cofee cup
        // you need a temporary cup to hold your tee so you can put your coffee in
        // and put your tea back into coffee cup


        long temp = nums[0];         //    putting tea in the teacup to temp cup
        nums[0] = nums[nums.length-1]; //  putting coffee into tea cup
        nums[nums.length-1 ] = temp; //    putting tea(in temp cup) into coffee cup




    }
}
