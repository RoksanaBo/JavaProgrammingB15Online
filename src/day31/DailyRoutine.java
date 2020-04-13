package day31;

public class DailyRoutine {

    public static void wakeUp(){

        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm? Open your eyes again!");
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public static void drinkCoffee(){
        System.out.println("Turn on your coffee machine");
        System.out.println("Drink coffee");
        System.out.println("-----------------------------------------------------------------------------------");

    }

    public static void prepareKidsForSchool(){
        System.out.println("Kiss your kids");
        System.out.println(" Wake them up");
        System.out.println("Make breakfast");
        System.out.println("---------------------------------------------------------------------------------------");

    }

    public static void takeThemToSchool(){

        System.out.println("Take kids to school");
        System.out.println("Give a kiss");
        System.out.println("----------------------------------------------------------------------------------------");
    }


    public static void studyJava(){
        System.out.println("Think about Java");
        System.out.println("Learn Java");
    }


    public  static void sayILoveJava300Times(){

        for (int i = 1; i <=300 ; i++) {
            System.out.println(" I Love Java");

        }


    }




    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();


    }
}


