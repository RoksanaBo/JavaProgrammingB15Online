package pravila;

import java.util.Arrays;

public class SwapP {
    public static void main(String[] args) {
      //DAY26
     // Swap the values of first item and last item
        int[] myNumbesr = new int[]{10,40,30,7};

        int temp = myNumbesr[0]; // temp now has 10
        myNumbesr[0] = myNumbesr[3] ; // first item value become 7
        myNumbesr[3] = temp;  // last item now become 10
        System.out.println("myNumbers= " + Arrays.toString(myNumbesr));


        //Swap 40 and 30
        int temp2 = myNumbesr[1] ;
        myNumbesr[1] = myNumbesr[2] ;
        myNumbesr[2] = temp2;
        System.out.println("myNumbers= " + Arrays.toString(myNumbesr));

        // THE RESULT OF SWAPPING---> REVERSED ARRAY













    }
}
