package day22;

public class ArrayPractice_Double_int_boolean_Byte {

    public static void main(String[] args) {

        double[] prices = new double[5];
        System.out.println(prices[0]);
     // can NOT print out array variable directly
        // to see what's inside

        System.out.println(prices);
        prices[0]= 2.46;
         prices[1] = 12.96;
         prices[2]= 992.1;
         prices[3]= 500 ;
         prices[4]= 65.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);



        char[] name = new char[7];


        name[0] = 'R';
        name[1] = 'o';
        name[2] ='k';
        name[3] ='s';
        name[4] ='a';
        name[5]='n';
        name[6] ='a';
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);

        System.out.println(name);// this is only for char array


        boolean[] yesNo = new boolean[3] ;
        System.out.println(   yesNo[0]);
        System.out.println(   yesNo[1]);
        System.out.println(   yesNo[2]);

        yesNo[0] =true;
        yesNo[1]=false;
        yesNo[2]=10>7;  // true
        System.out.println(   yesNo[0]);
        System.out.println(   yesNo[1]);
        System.out.println(   yesNo[2]);
















    }
}
