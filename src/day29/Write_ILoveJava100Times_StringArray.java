package day29;

import java.util.Arrays;

public class Write_ILoveJava100Times_StringArray {

    public static void main(String[] args) {


        //   Create an array with size 300 and fill it up with I Love Java
        String [] strArr = new String[300];
        strArr[0] ="I love Java";
        strArr[1] ="I love Java";
        strArr[2] ="I love Java";

        for(int i =0; i< strArr.length;i++){
            strArr[i] = "I love Java";
        }
        System.out.println(Arrays.toString(strArr));

        //    kak napisat' cifru pered predlojeniem
        String [] strArrr = new String[300];
        strArr[0] ="I love Java";
        strArr[1] ="I love Java";
        strArr[2] ="I love Java";

        for(int i =0; i< strArrr.length;i++){
            strArrr[i] = (i+1) + ".I love Java";
        }
        System.out.println(Arrays.toString(strArrr));

        //
        String str = new String("ABC");// this is String object with value ABC
        String[] strArr2 =new String[5]; // Empty String array with capacity 5;
        strArr2[0] ="I love Java";
        strArr2[1] ="I love Java";
        strArr2[2] ="I love Java";
        strArr2[3] ="I love Java";
        strArr2[4] ="I love Java";
        System.out.println(Arrays.toString(strArr2));




    }
}
