package day56;

import java.net.PortUnreachableException;

/**
 * Sometimes we want to make a class that only generate single object
 * throughout  the entire application
 *
 * Tis is a design pattern called Singleton
 * It allows you to restrict the class to have only one object
 *
 *
 * -- add private static field with same type as class
 * -- add private constructor
 * -- add public method with return type same as class type.
 *
 *
 */
public class Singleton {   //Singleton means ONLY ONE OBJECT

    private static Singleton instance;

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton(); // create object here
        } else {
            System.out.println("we already have this object"); // do not create object if already exists.
        }
        return instance;

    }


    public Singleton(){
        System.out.println("no arg constructor being called");
    }


}






