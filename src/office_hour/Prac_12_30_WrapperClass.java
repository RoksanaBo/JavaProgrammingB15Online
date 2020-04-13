package office_hour;

public class Prac_12_30_WrapperClass {

    public static void main(String[] args) {

      int a  =10;
      Integer A = a;

      float f= 0.5f;
   //   Double F = f;  // each wrapper classes are dedicated to their own primitives

        Double num1 = 0.5;
        Short num3= 45;
        Integer num4 = 100;

        double num2 = num4;
        System.out.println( num2);

         Long number1 = 100L; // Auto
        Float f1 = 100.0f;

        double d1 = f1; // unboxing

        System.out.println(  Byte.MAX_VALUE ); // maximum value of byte primitive
        System.out.println( Byte.MIN_VALUE );  // minimum value of primitive byte

        System.out.println( Integer.MAX_VALUE );
        System.out.println( Integer.MIN_VALUE );



        // parse methods:
        String str1 = "123";
        int result = Integer.parseInt(str1); //
        System.out.println( result + 1 ); // poluchim 123+1 = 124

        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println( r1 ) ;

        String str3 = "FaLse";
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);

        String str4 = "Parvin"; // anything other than true, will returns false
        boolean r3 = Boolean.parseBoolean(str4);
        System.out.println(r3);


        // valueOf method:

        String s1 = "100.5";
        Double c1 = Double.parseDouble(s1); // auto boxing
        Double c2 = Double.parseDouble(s1);  //
        System.out.println( c1  + 1 ); // 101.5
        System.out.println(c2);

        String s2 = "tRUe";
        Boolean b1 = Boolean.valueOf(s2);
        System.out.println(b1);


        Boolean[] arr = new Boolean[3]; // default value is null
        System.out.println();


      System.out.println(addNum(100, 200));

    }
    public static  int addNum(int a, int b){

      return a+b;
    }

}
