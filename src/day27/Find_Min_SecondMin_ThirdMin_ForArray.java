package day27;

public class Find_Min_SecondMin_ThirdMin_ForArray {

    public static void main(String[] args) {

        // find the minimum number.DON'T use sort method

        int[] scores = {100, 897, 654, 32, 1231, 224, 556, 7 ,1, 2, 3, 4}  ;
      int min = scores[0]; // min:100

      for(int i =0; i< scores.length; i++){
          if( min > scores[i]){
              min = scores[i];
          }
      }
        System.out.println("minimum number :" + min);

      // FIND SECOND MINIMUM NUMBER:

      int secondMin = scores[0];
      for(int i=0;i<scores.length; i++){
          if(scores[i] == min){
              continue;
          }
          if(secondMin > scores[i] ){
              secondMin = scores[i];
          }
      }
        System.out.println("second minimum number is " + secondMin);

      //FIND THIRD MIN NUMBER:

        int thirdMin = scores[0];
        for(int i=0; i<scores.length; i++) {
            if(scores[i] == min || scores[i] == secondMin){
                continue;
            }
            if(thirdMin >scores[i] ){
                thirdMin = scores[i];
            }
        }
        System.out.println("third minimum number is "+thirdMin);






    }
}
