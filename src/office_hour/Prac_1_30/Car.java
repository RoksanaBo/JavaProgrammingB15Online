package office_hour.Prac_1_30;

import day47.ElectricCar;

public abstract class Car {

    // public abstract return-type methodName();

    public abstract void start();

}


class Toyota extends Car{

    public void start(){
        System.out.println("Push Button");
        System.out.println("Start Engine");
    }
}



class Jeep extends Car{

    @Override
    public void start(){
        System.out.println("Call Mechanic");
        System.out.println("Oil change");
        System.out.println("Start engine");
    }

}



abstract class ElectricCars extends Car{

    public abstract void HasBattery();
    // we have 2 abstract methods: start(), HasBattery()

}



class Tesla extends ElectricCar {

    @Override
    public void start(){
        System.out.println("say start");
        System.out.println("start engine");
    }



    public void HasBattery(){
      System.out.println("Tesla has battery");
    }

}





class Test{
    public static void main(String[] args) {

        Jeep obj1 = new Jeep();
        obj1.start();


        System.out.println("--------------------------------------------------");


        Toyota obj2 = new Toyota();
        obj2.start();


        System.out.println("-------------------------------------------------------");


        Tesla obj3 = new Tesla();
        obj3.start();
        obj3.HasBattery();


    }
}