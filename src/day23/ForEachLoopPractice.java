package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        //create a long array of 5 items called salaries
        // put your salary amounts that ok for your offer
        //
        //use for each loop to iterate over them
        // and print them out
        // print only the salary more than 100000

        long[] salaries = new long[]{100000L, 200000L, 150000L, 115000L, 60000L};

        for( long eachSalary : salaries ) {
            System.out.println("each salary = " + eachSalary);
        }

        for ( long salary  :   salaries    ){
            if( salary > 100000 ){
                System.out.println("salary = " + salary);
            }
        }
        // for SKIP to chto xotim iskluchit. mi ispolzuem continue
        // if(salary <=100000){
        //    continue;
        //   }
        //  System.out.println("salary =" + salary) ;












    }
}
