package day11;

public class LogicalOperators_Single {
    public static void main(String[] args) {

      //  System.out.println( 9/0); // ERROR can't divide by 0

       // System.out.println( 9/0  ==3   );

    //   combine the result of
    //   checking 5 is more than 10
    //   and 9 divided by 0 is 3
        System.out.println( 5>10  && 9/0==3 );

        System.out.println( 5>10  & 9/0==3 );//  pochemy?

    //------    Raznica mejdy && i &  ---------

        //&& and &  called logical and ,
        // it will give you same result

        //Difference between double and single comes
        // whether it will check the next condition if it can
        // already decide the whole result.

        System.out.println(10 >5 || 9/0==3);  //dal'she ne idet
        System.out.println(10 >5 | 9/0 ==3); // dal'she idet,pokazhet error












    }


}
