package office_hour.Prac_1_28;

public abstract class Animal implements Zoo{


    // 1. no object creation


    // invisible default constructor:
    public Animal(){
    }


    // information --> variable

    // variables - local, instance, static

    int age;
    String color;
    String breed;


    // Actions --> method
    // methods --> instance, constructor

    // concrete variable
    public void eat(){
        System.out.println("The animal is eating");
    }


    public void call(){
        System.out.println("The animal is calling ...");
    }


    // what if we just declare a method that should be in child class,
    //and they have different body

    // abstract method --> I want this method to be appear in both
    // cat and dog classes , yet they should
    // have different body implementation
    public abstract void run();

}
