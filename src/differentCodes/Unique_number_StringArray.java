package differentCodes;

public class Unique_number_StringArray {

    public static void main(String[] args) {


       String[] arr = {"A", "A", "B", "C", "C"};
       // index         0    1    2    3     4



        int count1 =0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals("A") ){
                count1++;
            }

        } System.out.println(count1);




//------------------------------------------------------------------------------------

        // how many times "A" is appeared in the array
       for(int j=0;j<arr.length;j++) {

           int count = 0;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i].equals(arr[j])) {
                   count++;

               }
           }
           System.out.println(count);
       }

    }
}
