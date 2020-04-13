package day21;

public class SkipAll5s_Continue_Example {

    public static void main(String[] args) {

        // count 1 to 20
        // skip all the numbers divisible by 5
        // x % 5 ==0


        for (int x = 1; x <=100 ; x++) {

            if(x % 5 == 0) {
                System.out.println("skipping" + x);
                continue;
            }
            System.out.println(x);
        }

        // without continue
         for (int x = 1; x<=100 ; x++) {
               if(x%5 !=0){
                   System.out.println(x);
               }else{
                   System.out.println("skipping " + x);
               }

        }




    }
}
