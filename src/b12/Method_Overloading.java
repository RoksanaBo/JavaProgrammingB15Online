package b12;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Method_Overloading {

    public static void main(String[] args) {

        int result = sum(10,20); // a+b
        System.out.println(result);

        System.out.println(sum(10,20,30));

        sum(0.5, 10.5);
        System.out.println(  sum(0.5, 10.5));




        int[] arr ={1,2,3,4,5};
        Sort(arr); // 5 4 3 2 1

        char[] ch = {'a','b','c'};
        Sort(ch);

        String[] str = {"A", "B", "C", "D"}; // D C B A
        Sort(str);


    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, long b, int c){
        return a+ (int)b+c;
    }

    public static double sum(double a,double b){
        return a+b;
    }

//---------------------------------------------------------------------------------------------------------------

    public static void Sort(int[]arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) { // reversed order
            System.out.print(arr[i] + " ");
        }
        System.out.println();// to break the line
    }



    public static void Sort(char[] arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) { // reversed order
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // to break the line
    }



    public static void Sort(String[] arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) { // reversed order
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



}
