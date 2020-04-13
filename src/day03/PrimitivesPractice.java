package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount  );

        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount);

        int catCount = 20;
        System.out.println("The count of cats is " + catCount);


        long mileToMoon = 5000000l;
        System.out.println("The miles to sun is " + mileToMoon);
        long mileToSun = 10000000L;
        System.out.println("The mile to sun is " + mileToSun) ;


        //---------floating point ------

        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is " + priceOfBanana);

        float priceOfPotato = 2.49F;
        System.out.println("The price of potato is " + priceOfPotato);
        // you must put f at the end of number to indicate this is float data type
        // uppercase lowercase does not matter , but it's mandatory



        //-------larger floating point numbers-----
        double priceOfIpad1 = 355.99d ;
        System.out.println("THe price of Ipad1 is " +priceOfIpad1);
        double priceOfIpadPro = 1024.99D ;
        System.out.println("THe price of IpadPro is " + priceOfIpadPro);
        // compiler automatically assume it's not required to have d
        // however for good programming habbit ,add them always
        double priceOfMac  = 2299.99 ;
        System.out.println("The price of Mac is " + priceOfMac);

        // if you have a whole number by itself, compiler automatically assume it's an int
        // if you have a fractional number by itself, compiler automatically assume it's an double

        //



    }


}
