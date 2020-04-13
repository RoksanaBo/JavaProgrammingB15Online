package day17;

public class Task_1_NameCorrector {
    public static void main(String[] args) {

       // create a String variable to store your name in any case  combination
        // for example jon jOn jON any of them:
        // create a variable called name2
        // make your first letter uppercase then rest lowercase

        // jon---> Jon     arya----> Arya
        // Optionally ask your name from Scanner

        // Optionally ask your full name
        // --> then make your name from Scanner
        // Optionally ask your full name
        // --> then make your full name first letter uppercase the rest lowercase

        
        //  SPOSOB 1:
        //             0123456
        String name = "roksana";
       
        String nameFixed = (name.charAt(0) + "" ).toUpperCase();
               nameFixed = nameFixed + name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);
        
        //SPOSOB 2:

        String nameFix = name.toUpperCase().substring(0,1);
               nameFix += name.substring(1).toLowerCase();

        System.out.println("nameFix = " + nameFix);







    }
}
