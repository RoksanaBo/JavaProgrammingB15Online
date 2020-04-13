package day11;

public class StringEquality {
    public static void main(String[] args) {

        // STRING CLASS- a special class in java to create and manipulate string
        // STRING - stroka, ryad

        String name = "Roksana" ;// STRING LITERAL

        String name2 = new String("Roksana");

        String name3 = "Roksana";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println( name==name2  );
        System.out.println( name==name3 );

        // The correct way of comparing String to get consistent result is
        // using one of the String object behavior / method called equal method
        // str1.equals(str2)
        System.out.println("USING EQUALS METHODS");
        System.out.println( name.equals( name2) );
        System.out.println( name.equals( name3) );










    }
}
