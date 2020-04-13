package day22;

public class ArrayExample {

    public static void main(String[] args) {


        // create an byte array with size 4
        // and store it into a variable called data
        byte[] data = new byte[4];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;

        // assign value for each index location

        // print out the values at each index
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        // update last index value
        data[3] = 127;
        // then print it out
        System.out.println(data[3]);







    }
}
