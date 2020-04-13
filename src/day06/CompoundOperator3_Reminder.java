package day06;

public class CompoundOperator3_Reminder {

    public static void main(String[] args) {


        int bankBalance = 1140;
        System.out.println(" I have spend the half of it : " + bankBalance);
        //bankBalance = bankBalance / 2;
        bankBalance /=2;
        System.out.println("Now my balance is " + bankBalance);

        // I want to divide the balance by 500 and keep the reminder in my pocket
        //  bankBalance = bankBalance % 500;
        bankBalance %= 500; // 570 divided by 500; reminder is 70;
        System.out.println("I want to divide the balance by 500 and keep the reminder in my pocket  ");
        System.out.println(" the remainder is :" + bankBalance);





    }




}
