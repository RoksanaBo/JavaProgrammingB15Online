package day23;

public class ForEachLoopPractice_Find_Max {

    public static void main(String[] args) {

        // we need to pick up the number from this array to compare with other items
       //since first one is right here, I just decided to pick it up
       // and make it the MAX value

        long[] salaries = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};
        long max = salaries[0];

        for (long salary : salaries) {
            if( salary>max   ) {

                max = salary;  // kotorii salary bol'she tot ostaetsya,menshii
                                    // zamenyaetsya na bol'shii
            }

        }
        System.out.println("maxSalary = " + max);












    }
}
