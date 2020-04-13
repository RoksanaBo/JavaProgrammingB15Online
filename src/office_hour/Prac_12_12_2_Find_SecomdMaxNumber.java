package office_hour;

public class Prac_12_12_2_Find_SecomdMaxNumber {

    public static void main(String[] args) {

        //write a program that can find the second max number from an int array.
        //DO NOT USE sort method

        int[] grades = {1,2,3,4,5,6,7,8};// expected result 7

        int max = grades[0];


        for(int eachGrade  :    grades )

            if(eachGrade > max) {
               max = eachGrade;
        }
        System.out.println("first maximum number is " + max);


            int secondMax = grades[0];
            for(int eachGrade  :  grades) {
                if(eachGrade==max)  {
                    continue;
                }
                if(eachGrade>secondMax) {
                    secondMax = eachGrade;
                }
            }
        System.out.println("second maximum number is " + secondMax);










    }
}
