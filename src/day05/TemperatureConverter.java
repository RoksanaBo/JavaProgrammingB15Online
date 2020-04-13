package day05;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {


        Scanner bars = new Scanner(System.in);
        System.out.println("what is the temperature in F ");
        double farenheit = bars.nextDouble();
        double celsius = (5.0 / 9) * (farenheit - 32);
        System.out.println("farenheit " + farenheit + " is " + celsius + " in celsius");














    }
}
