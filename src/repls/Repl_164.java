package repls;

import java.util.Scanner;

/*
max function gets two ints, x and max.
x is the test case, max is what we test against.

if  x is bigger then max return max
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5
 */
public class Repl_164 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int x = scan.nextInt();
        max(x,max);

    }




    public static int max(int x,int  max){
        if(x>max){
            return max;
        }else{
            return x;
        }
    }





}
