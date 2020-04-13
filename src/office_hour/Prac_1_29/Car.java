package office_hour.Prac_1_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {


    String brand;
    // Car has Engine, so we are using
    // Engine as instance variable data type
    Engine e;

    // I want a car object has passenger names attached to it


 //   String[] passengers;
    List<String> passengers;


    public static void main(String[] args) {

        Car c1 = new Car();

        // there are 2 ways to create String object
        // and we are using new keyword by choice

        c1.brand = new String("Toyota");       //"Toyota";
        c1.e    =  new Engine("V6",270);
//        c1.passengers = new String[]{"Zina","Mehmet","Rauf","Akokul"};
        c1.passengers = Arrays.asList("Zina","Mehmet","Rauf","Akokul");

        System.out.println("c1 = " + c1);

    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +
                ", passengers=" + passengers +
                '}';
    }
}
