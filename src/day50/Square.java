package day50;

public class Square extends Shape{

    //    String name;     eto mi berem iz Shape.   mi ix ne vidim ,no oni u nas est'
    //    double area;     eto mi berem iz Shape.
    int length;



    //
    public Square(String name, int length) {
        super(name);    // reusing functionality of super class
        this.length = length;
    }


//    we need to implement 2 methods:

    public void calculateArea() {
        area = length * length; // this is how we calculate area of square
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with 90 degree , length "
                + length + " with color " + COLOR); // Drawable.COLOR  - static way
    }




    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


    //    public abstract void calculateArea();
    //    public abstract void draw();



}
