package office_hour.Prac_1_28;

public class Dog extends Animal{

    // Dog is an animal

    String dogName;


    @Override
    public void run() {
        System.out.println("The dog is running");
    }


    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}
