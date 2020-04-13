package day51;



//  a class    implements  an  interface   ---   klass realizuet interfeis
//  an interface   extends  another  interface
//  a class    extends   class

public class Drone implements UprightFlyable {


    @Override
    public void flyUpligth() {
        System.out.println("Flying upright");
    }

    @Override
    public void fly() {
        System.out.println("Flying regularly ");
    }
}