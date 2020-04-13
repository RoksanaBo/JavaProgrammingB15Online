package day49;



public class Tesla extends Vehicle implements Autonomous, Chargeable {

    int horsePower;
    String model;


    // constructor:
    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    // we inherit from Chargeable interface
    //    public  void charge(){
    //        System.out.println("DEFAULT charge, " +
   //                "You may wanna do on your own");
   //    }

    // we inherit from Vehicle abstract class
//    public void goForward(){
//        System.out.println("Vehicle going forward");
//    }



    //  we need to implement:  implement method, right click
    @Override
    public void selfDrive() {
        System.out.println("TESLA model " + model + " SELF DRIVING !!! ");
    }

    @Override
    public void start() {
        System.out.println("TESLA model " + model + " start with electricity");
    }


    // toString method:
    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }



}
