package day11;

public class LogicalOperators {
    public static void main(String[] args) {

        // combining multiple condition together
        // in java there is no range check directly like math
        // for example:  int x = 70
        // in math : 60 < x < 100 ----> true < 100
        // in java : we would do  x>60 && x <100
        // && 2 double ampersand  & 1 ampersand ----> LOGICAL AND operator
        // This used to check both conditions are true at the same time

       // naprimer   int x =70;  x>60 && x<100;   true

        //           int x =10;  x>60 && x<100;   false

        //           int x =110;  x>60 && x<100;  false

       //            int x =99;  x>60 && x<100;    true


/*
//-eto pipe.   || or | pipe is used for compiling 2 conditions : Logical OR operator
  If you have 2 conditions to check
  When will this be true : As long as one side is true, whole result will be true
  // think about buying milk from 2 stores
  As long as you found the milk in one store, you got the milk then you get out

   int x = 70;   x > 10 || x < 5 ---> true

   int x= 7;     x > 10|| x < 5 -----> false

   int x= 17;    x > 10|| x < 5  -----> true

   int x= -8;    x > 10|| x < 5  -----> true

 */
        System.out.println("TRUTH TABLE ");
        System.out.println("RESULT OF true && true is " +(true && true) );// true
        System.out.println("RESULT OF false && true is " +(false && true) );// false
        System.out.println("RESULT OF true && false is " +(true && false) );// false
        System.out.println("RESULT OF false && false is " +(false && false) );// false


        System.out.println("TRUTH TABLE || ");
        System.out.println("RESULT OF true || true is " +(true || true) );//  true
        System.out.println("RESULT OF false || true is " +(false || true) );// true
        System.out.println("RESULT OF true || false is " +(true || false) );// true
        System.out.println("RESULT OF false || false is " +(false || false) );// false


        /*Create a variable called num with type int
        find out whether this number is > 100 or <10
         */

        /*find out the number is within the range og 10-60
        and print out the result
         */
        int x = 55;
        System.out.println("------ x > 100 || x<10 -----");
        System.out.println( x>100|| x<10);
        System.out.println( x>10 && x<60);

          // more than 2 conditions at the same time, 3 conditions:
        System.out.println( true || false || false ); // true
        System.out.println( true && true && false );// false

        System.out.println(  x== 50 || x==51 || x==55 );//true
                        // sperva sveriaem x==50 i x==51,potom s x==55

        // check x is more than 50 and x is not equal to 52 or x equal to 57

        System.out.println( x>50 && x!= 52 || x==57); // true
                           // zdes true&& true + true||false i poluchaetsya true

        System.out.println( false || true &&  true   );











    }
}
