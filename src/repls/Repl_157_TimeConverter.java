package repls;

import java.util.Scanner;

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */
public class Repl_157_TimeConverter {

    /*
    If the time is between 12:00 AM and 12:59 AM, we subtract 12 hours.
    If the time is between 1:00 AM and 12:59 PM, 24 hour time is same as 12 hour time.
    If the time is between 1:00 PM and 11:59 PM, we add 12 hours to input time.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         String str = scan.next();
        timeConversion(str);

        }

        public static void timeConversion(String s) {
            String time="";

             if(time.contains("AM")){
                 time = time.replace("AM", "");

                 String[] timeArr = time.split(":");

                 if(timeArr[0].equals("12")){
                     timeArr[0] = "00";
                 }
                 time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
             }
             else if(time.contains("PM")){
                 time = time.replace("PM", "");
                 String[] timeArr = time.split(":");
                 if(!timeArr[0].equals("12")){
                     timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0])+12);
                 }
                 time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
             }
            System.out.println(time);

             }


        }

