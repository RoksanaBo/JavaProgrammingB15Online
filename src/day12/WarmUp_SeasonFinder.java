package day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {

        int month = 11 ;

       if( month>12 || month<1){
           System.out.println("invalid month");
       }else if(month>=3 && month<=5) {
           System.out.println("spring");
       }else if(month>=6 && month<=8) {
           System.out.println("summer");
       }else if(month>8 && month<12) {
           System.out.println("fall");
       }else if(month==12 || month==1 || month==2){
           System.out.println("winter");
       }

//    since first condition is already taking out invalid situations,we don't need
        //else
        //else in general is optional







    }
}
