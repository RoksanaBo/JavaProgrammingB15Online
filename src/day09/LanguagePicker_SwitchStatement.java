package day09;

public class LanguagePicker_SwitchStatement {
    public static void main(String[] args) {

        System.out.println("welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-7");

        int languageOption = 1;
        String greeting = "";
        switch (languageOption){
            case 1 :
                greeting = "Salam";
                break;
            case 2 :
                greeting = "Hello";
                break;
            case 3 :
                greeting = "Privet";
                break;
            case 4 :
                greeting = "Mehraba";
                break;
            case 5 :
                greeting = "Hola";
                break;
            case 6 :
                greeting = "Namaste";
                break;
            case 7 :
                greeting = "kamarjoba";
                break;
            default:
                System.out.println(greeting + " ,SDET");

        }


    }

}
