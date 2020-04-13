package day27;

public class Multi_D_ArraysTask_With_Loops_MinMaxNumbers {

    public static void main(String[] args) {

        // FOR LOOP:

        int[] [] numbers = {   {12,11,10,19}  , { 19,20,15}  };
        int max =numbers[0] [0];  // assume that first element is the max

        for(int i =0; i< numbers.length; i++) {  // checks each single dimentional array

            for(int j =0; j<numbers[i].length ;j++ ){  // checks each element in single dimen. array

                if(max <numbers[i] [j] ) {
                    max = numbers[i] [j];
                }

            }
        }
        System.out.println(max);


        // FOR EACH LOOP:
        int max2 = numbers[0][0];
        for(int[] each1DArray  :  numbers      ){ // each1DArray represents each sigle dimen.array

            for( int eachInt :  each1DArray){

                if(max2 < eachInt){
                    max2 = eachInt;
                }
            }
        }
        System.out.println(max2);


        //FIND MINIMUM NUMBER: for loop

        int min = numbers[0][0];
        for(int i =0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if(min > numbers[i][j] ) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println(min);








    }
}
