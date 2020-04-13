package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        int num ; // we are only declaring a variable
        num = 10 ;// we're assingning a value on different line


        // creating an array in second way

        int[] ages = new int[]{ 3,5,11,33,57,18 };
        int itemCount = ages.length ;
        System.out.println("itemCount = "  +  itemCount);
        System.out.println("ages = "+  ages);

        for (int x = 0; x < itemCount; x++) {
            System.out.print(  ages[x]    );
        }



        int [] areaCodes= {703 , 300 , 954 ,665 } ;

        for (int x = 0; x <areaCodes.length ; x++) {
            System.out.println(areaCodes[x] + " ");

        }



    }
}
