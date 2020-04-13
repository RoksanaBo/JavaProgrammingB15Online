package repls;

import java.util.Scanner;

public class repl_152 {
    public static void main(String[] args) {

 //       Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.
 //       for example:
 //      plus_minus (new int[]{1,2,55,-9,-2,0});
 //       will output:
 //       positives:3, negatives:2, zeros:1


      Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }



        plus_minus(arr);
    }//end main

  public static void plus_minus(int[] arr) {

     int cntn=0;
        int cntz = 0;
        int cntp = 0;

      for(int i=0; i<arr.length; i++){
          if(arr[i] < 0){
              cntn++;
          }else if(arr[i] == 0){
              cntz++;
          }else{
              cntp++;
          }
      }
      System.out.println("positive :" + cntp);
      System.out.println("negative: " + cntn);
      System.out.println("zero =" + cntz);

  }






    }

