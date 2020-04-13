package day17;

public class OddNumberBackward {

    public static void main(String[] args) {

        int x = 100;
        while (x>0){

            // if x divided by 2 have reminder
            // for example 5/2=2 1 reminder  5%2=1  1!=0

            if(x%2 !=0){
                System.out.println(x + " is odd number");

            }
            --x;
        }


    }
}
