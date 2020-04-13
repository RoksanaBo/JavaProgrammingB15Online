package repls;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class Repl_126_Print_Shortest_Words {
    public static void main(String[] args) {


        /*
          Write a program that will find out shortest words in the
          given string str. If there are few words that are evenly short,
          print them all. Use split method in order to split str string variable and
          create an array of strings.  Print array with Arrays.toString() method.
          Sort array before printing.

          Split values by comma: split(", ");
          input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
          output: [cat, old, ray]
         */




        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] eachWord = str.split(", ");

        String shortest = eachWord[0];

        for(String eachArr : eachWord){
            if(eachArr.length()< shortest.length()){
                shortest = eachArr;
            }
        }

        String allShortest = "";
        for(String each : eachWord){

            if(each.length()==shortest.length()){

                allShortest = allShortest  + each+" ";  // because we already have "old"
            }
        }


        String[] sorted = allShortest.split(" ");
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }


}




