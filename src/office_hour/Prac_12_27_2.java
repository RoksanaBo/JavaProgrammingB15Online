package office_hour;

public class Prac_12_27_2 {
    public static void main(String[] args) {

        OddEven(100);
    }

    // write method to verify any number -if it's even or odd

    public static void OddEven(int number){

        if(number % 2 == 0){
            System.out.println(number + " is even number");
            return;
        }
        System.out.println(number + " is odd number");

    }

}
