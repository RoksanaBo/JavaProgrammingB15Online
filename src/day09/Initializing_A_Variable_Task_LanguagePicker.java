package day09;

public class Initializing_A_Variable_Task_LanguagePicker {
    public static void main(String[] args) {

        // a variable inside a method must get initial value
        // before it's being used for the first time
        //and there should not be any chance
        // this variable does not get value before usage
        // System.out.println(num);

             //------------ TASK: LANGUAGE PICKER ---------
        // assume you are on the call and you have been given option to be
        //greeting by the language of your choice according to the number you
        // provided,
        // Create a variable called languageOption and assign value,
        // String variable called greeting , assign an empty String

        // 1--> "Hello"
        // 2--> "Salam"
        // 3 --> "Hola"
        // 4 ---> "Privet"
        // 5---> "Merhaba"
        // 6 --->"bonjour"
        // The program should set the value of a String variable called greeting
        // to this value : 1 ---> "Hello, SDET"

        // Print out--->>This is how the greeting message you get : "Hello,SDET"

        System.out.println("welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-7");

        int languageOption = 1 ;
        String greeting = "" ;

        if(languageOption ==1){
            greeting = "Hello";
        }else if(languageOption==2){
            greeting = "Privet";
        }else{
            greeting = "Unknown";
        }
        System.out.println(greeting + ", SDET");



    }
}
