package day49;

public abstract class Vehicle {


    int year;

    public Vehicle() {
    }



    //   constructor:
    public Vehicle(int year) {
        this.year = year;
    }



   //   abstract method.
    public abstract void start();



    // it has body:
    public void goForward() {
        System.out.println("Vehicle going forward");
    }


}
