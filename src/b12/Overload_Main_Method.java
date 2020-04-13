package b12;

public class Overload_Main_Method {

    public static void main(String[] kfc) {

        System.out.println("String Array");


        boolean[] array1 = {true, false};
        main(array1);

        double[] array2 = {1,2,3};
        main(array2);

    }

    public static void main(int[] a){
        System.out.println("int Array");
    }

    public static void main(double[] b){
        System.out.println("double Array");
    }

    public static void main(boolean[] c){
        System.out.println("boolean Array");
    }



}
