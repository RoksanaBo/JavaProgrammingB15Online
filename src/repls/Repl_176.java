package repls;

import java.util.Scanner;

/*
To book  a room first it needs to be available for rent
 and make sure its available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018
example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
*/
public class Repl_176 {
    public static void main(String[] args) {


        System.out.println(simpleRoomBook(false,2,1,2018));


    }


    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {



        if(isAvailable==false ||year!=2018 ||( month==7 && day<=8 ) ){
            return false;

        }else{
            return true;
        }
    }

}
