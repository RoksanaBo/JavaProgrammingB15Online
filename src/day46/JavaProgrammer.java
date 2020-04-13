package day46;

public class JavaProgrammer extends Programmer {



    @Override
    void code(){
        System.out.println("I code Java");

    }

    @Override
    void test(){
        super.test();
        System.out.println("we do test in JUnit");
    }


    public void drinkCoffee(){
        System.out.println("Java programmers drink lots of coffee");
    }

    public void doJavaDevelopment(){
        System.out.println("Java programmers do Java Development");
    }
}
