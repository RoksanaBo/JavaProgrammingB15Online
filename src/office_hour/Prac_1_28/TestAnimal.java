package office_hour.Prac_1_28;

public class TestAnimal {

    public static void main(String[] args) {

        // create object --> we cannot because Animal is
        // abstract class

       //  Animal animal1 = new Animal();


        Dog dog = new Dog();
        dog.eat();
        dog.call(); //the animal is calling..
        dog.run(); // the dog is running
        dog.sleep();
        System.out.println(dog.ZOO_NAME);


        System.out.println("--------------------------------------------------------------");


        Cat cat = new Cat();
        cat.eat();
        cat.call();
        cat.run(); // The cat is running..
        cat.sleep();
        System.out.println(cat.ZOO_NAME);




    }
}
