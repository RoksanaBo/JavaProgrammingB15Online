package office_hour;

public class Prac_12_12_Print_UniqueValue_FromString {

    public static void main(String[] args) {

        //write a program,that can print out the unique values from String Array

        String[] array = {"A" , "A", "B", "C", "C"} ; //excepted result B

        int count2 = 0;// to store the number of appearance
        for(int i=0; i< array.length; i++) {
            if (array[i].equals(array[0]) ) {
                count2++;


            }
        }
        if(count2 ==1) {
            System.out.println(array[1]);
        }

       // esli index ne unique on ne print out.










    }
}
