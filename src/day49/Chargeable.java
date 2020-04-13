package day49;


public interface Chargeable {


    //default method:
    public default void charge() {

        System.out.println("DEFAULT charge, " + "You may wanna do on your own");
    }

}
