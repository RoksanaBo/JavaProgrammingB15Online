package day44;

public class CyberHouse {

    String design;
    int houseNum;
    // we can change default value of the fields
    // by assigning value directly in the template class


   private static String neighborhoodName= "Cybertek Ave";


    // constructor: it can access anything
    public CyberHouse(String design, int houseNum){
        this.design = design;
        this.houseNum = houseNum;
    }


    // instance method can access anything
    public void showAllInfo() {

        System.out.println("house: " + this.houseNum +
                            ", design: " + design +
                             ", neighbourhoodName " + neighborhoodName);
    }


    // static method can only access static members of same class
    public static void showNeighbourhoodName(){
        System.out.println("neighborhoodName = " + neighborhoodName);

        // we can't access anything non-static inside static methods
        //  System.out.println("houseNum = " + houseNum);
    }
}
