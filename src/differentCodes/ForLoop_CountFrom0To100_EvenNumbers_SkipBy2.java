package differentCodes;

public class ForLoop_CountFrom0To100_EvenNumbers_SkipBy2 {

    public static void main(String[] args) {

        for(int i=0; i<100; i=i+2){
            System.out.print(i + " ");
        }
//   if start with int=1, mi poluchim 1 3 5 7 9 ...... odd numbers

 //   skip counting by 3:
        for (int i = 0; i <100 ; i+=3) {  // 0 3 6 9 12 15 18 21 24.....
            System.out.println(i +" ");
        }











    }
}
