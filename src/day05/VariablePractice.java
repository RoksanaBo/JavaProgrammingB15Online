package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitives
        /*


         Block comment
         */
        /* whole numbers      : byte short int long
        fractional numbers    : float double
        logical               : boolean ( true, false)
        character             : char (single character and single code)

        Usually by default for whole numbers : use int
        Usually by default for fractional numbers : use double

        IS String part of Primitive types? NO!!!
        String is sequence of character
         */
        //  TASK 1 : Age calculator
        // given birth year , please calculate the age

        int birthYear = 1985;
        int currentYear = 2019;
         int age = currentYear - birthYear;
         // I was born in year 1985, and I am 34 years old;
          System.out.println(" I was born in year " + birthYear + " and I am  " + age + " year old");



        // TASK 2: you are speeding today

        // speed limit is some number , and your current speed is this
       // generate this output of : You are driving 10 mpl more than speed limit
       // speedLimit as int, currentSpeed as int, overTheLimit as int


        int speedLimit = 45;
        int currentSpeed = 55;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.print("I am driving " + overTheLimit + " mlp more than speed limit");












    }

}