package day26;

import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args){


        String name1 = "Emma";
        String name2 = "Jason";

        // name2 should have Emma, name1 should have Jason

        String tempContainer = name1; // emma
        name1 =name2; // name1---> Jason
        name2 = tempContainer; // name ---> Emma

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        // swap the values of first item and last item
        int[] myNumbesr = new int[]{10,40,30,7};

        int temp = myNumbesr[0]; // temp now has 10
        myNumbesr[0] = myNumbesr[3] ; // first item value become 7
        myNumbesr[3] = temp;  // last item now become 10

        System.out.println(  "first item = " + myNumbesr[0]   );
        System.out.println(   "last item = " + myNumbesr[3]    );

        // poluchilos'
        System.out.println("myNumbers = " + Arrays.toString(myNumbesr) );

        //Swap 40 and 30
        int temp2 = myNumbesr[1] ;
        myNumbesr[1] = myNumbesr[2] ;
        myNumbesr[2] = temp2;
        System.out.println("myNumbers= " + Arrays.toString(myNumbesr));








    }
}
