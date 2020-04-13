package day53;

public abstract class Fruit {


    String taste;
    String color;


    //  constructor:
    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }


    //  abstract method:  no body
    public abstract void getDigested();



    @Override
    public String toString() {
        return "HELLO FROM FRUIT";
    }
}
