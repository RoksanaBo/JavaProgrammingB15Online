package office_hour;

public class Prac_12_27 {

    public static void main(String[] args) {

      String a = "ABCDEFG";

        for (int i = a.length()-1; i >=0; i--) {
            System.out.print(a.substring(i, i+1));
        }

        System.out.println();

        System.out.println("-----------------------------------------------------------------------");
        String a1 = "Esra Fidan";
        for (int i = a1.length()-1; i >=0; i--) {
            System.out.print(a1.substring(i, i+1));
        }
    }
    public  static void method1(){
        System.out.println("Hello Batch 15");
        // return type is void,cannot return any value
    }
    public static void method2(){
        if(true){
            return;// exits the current method
        }
        System.out.println("Test completed");// will not print this
    }

    public static double method3(){
        // if return type is not void, the method MUST return a value at the end.
        return 10.5f;
    }

    public static boolean Eligible(int age){
        if(age > 35){
            return true;
        }
        return false;
    }



}
