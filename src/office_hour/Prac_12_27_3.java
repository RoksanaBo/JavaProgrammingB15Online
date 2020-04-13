package office_hour;

import java.util.Arrays;

public class Prac_12_27_3 {

    public static void main(String[] args) {

        System.out.println(ConvertKmToMiles(1));
        System.out.println(ConvertGallonsToLitters(100));

        int[]array = {2,3,1,5};
        DescOrder(array);

        calculate(10,5,'*');




    }

    //Task 1:
    // write a method that can convert km to miles
    //	 				Hint: 1 km = 0.612 miles
    public static double ConvertKmToMiles(double km) {

        double miles = km*0.612;
        return miles;
    }

    //Task 2:
    // write a method that can convert gallons to litters
    //	 			   Hint: 1 G = 3.75 L

    public static double ConvertGallonsToLitters(double gallons){

        double litters = gallons * 3.75;

        return litters;
    }

    //Task 3:
    //  write a method that can print out the array in Descending order--v poryadke ubivaniya

    public static void DescOrder(int [] array){ // [ 2,3,1,5]

        Arrays.sort(array); // [ 1,2,3,5]

        for(int i =array.length-1;   i>=0;  i--){
            System.out.print(array[i] + " ");
        }
    }

    //Task 4:
    // 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
    //	and prints out the calculation
    //	if operator is not between [-, +, *, /, %] output should be Invalid Operator
    //  Example: calculate(10, 2, "*") ==> 20;
    //	calculate(20, 2, "~") ==> invalid operator

    public static void calculate(int a, int b, char operators){

        switch (operators){
            case '-':
                System.out.println(a-b);
                break;
            case '+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator");
        }












    }

    //Task 5 :
//       write a method that can calculate grade
//					if score is 100 ~ 90 ==> A
//					if score is 89 ~ 80 ==> B
//					if score is 79 ~ 70 ==> C
//					if score is 69 ~ 60 ==> D
//					if score is 0 ~ 59 ==> F
 //                  otherwise ==> Invalid Score
    public static void GradeCalculator(double score){



    }

    }







