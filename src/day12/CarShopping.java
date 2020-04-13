package day12;

public class CarShopping {

    public static void main(String[] args) {

       // Buy corolla or Tesla only if it's within the budget

       String carBrand="corolla";
       int carPrice = 60000;
       int budget = 40000;
       if( carBrand.equals("corolla")  || carBrand.equals("Tesla")   &&   carPrice <=budget  ){
           System.out.println("Car acquired");
       }else {
           System.out.println("not what i am looking for");
       }






    }
}
