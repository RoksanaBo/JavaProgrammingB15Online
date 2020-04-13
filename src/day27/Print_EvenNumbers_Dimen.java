package day27;

public class Print_EvenNumbers_Dimen {

    public static void main(String[] args) {

       // print entire even numbers: use continue statement
        // we need nested loop
        //                 0          1                     2
       int[] [] ages ={   {10}  ,{12,13,14,16,17}   , {19,20,21,22,23}  } ;

       for(int i=0; i< ages.length; i++) {

           for(int j =0; j<ages[i].length ;  j++){

               if(ages[i] [j] %2 !=0){
                   continue; // means skip it if number is odd !!!!
               }

               System.out.println(ages[i] [j]+" " );
           }
       }





    }
}
