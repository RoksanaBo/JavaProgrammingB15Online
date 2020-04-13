package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {


        int x =10;
        // primitive data types are pure value has no attribute or behavior
        // each primitive type has wrapper class that turn it into object
        // so we can treat it as

        // this is the old not recommended way of create Integer Object
        Integer x1 = new Integer(12);

       // value method of integer class return an integer object
        // by wrapping up the value you passed
        //it has 2 overloaded version one that accept int,
        // another accept string
        Integer x2 = Integer.valueOf(10) ;
        Integer x3 = Integer.valueOf("10");

        // since x2 is pointing to Integer Object
        // we can call all the methods of Integer Class using this Object
        byte bValue = x2.byteValue();
        System.out.println("byte value = " + bValue);

        double dValue = x2.doubleValue();
        System.out.println("double value = " + dValue);


    }
}
