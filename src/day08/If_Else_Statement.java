package day08;

public class If_Else_Statement {

    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentspeed = 145 ;

        // if the current speed is > than speed limit,
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court

        boolean IamSpeeding =  yourCurrentspeed > speedLimit ;
        // INSIDE THE PERENTHESIS WE CAN ONLY PUT
        // BOOLEAN VALUE
        // BOOLEAN VARIABLE
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE


        if( yourCurrentspeed > speedLimit ) {

            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        } else {
            System.out.println("go shopping !!");
            System.out.println("buy icecream");
            System.out.println("enjoy your day!!");
        }

        System.out.println("THE END");



        // if not over the limit
        // go shopping

        // outside if statement , say the end


    }






}
