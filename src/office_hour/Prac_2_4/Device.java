package office_hour.Prac_2_4;

public abstract class Device implements WaterProof{

//  Samsung (child class) --> Device (super class) --> WaterProof(Interface)

    int size;
    int price;

    public void call(){
        System.out.println("Calling with device ..");
    }



    //abstract method
    public abstract void sendMessage();

    }



