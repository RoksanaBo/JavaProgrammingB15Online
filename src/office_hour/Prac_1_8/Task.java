package office_hour.Prac_1_8;

import java.util.Arrays;
import java.util.List;

public class Task {

    public static void main(String[] args) {


        // this is the short way to create list that non-resizable

        List<String> numLst = Arrays.asList("79","54", "100", "65", "44", "78", "68", "98","89", "77");
        System.out.println(numLst);

       for(String each : numLst){

           int eachNum = Integer.parseInt(each);

           if(eachNum > 60){
               System.out.println("pass = " + eachNum);
           }else{
               System.out.println("fail = " + eachNum);
           }
       }

       // count how many score are more than 90:
        int count = 0;
       for(String each : numLst){

           if(Integer.parseInt(each) >90){
               ++count;
           }
       }
        System.out.println("count = " + count);



       // get the average score:
        int sum = 0;
        for(String each : numLst){

            sum = sum + Integer.parseInt(each);
        }
        System.out.println("average = " + sum / numLst.size());








    }
}
