package office_hour.Prac_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {     //  HAS-A relationship






    public static void main(String[] args) {


        Testers Hasan = new Testers("Hasan","Manual Tester", 85000);

 //       System.out.println(Hasan.jobTitle); // Manual Tester
 //       System.out.println(Hasan.employeeName); // Hasan
 //       System.out.println(Hasan.salary);      //  85000

        Hasan.getEmployeeInfo();
        Testers Alisa = new Testers("Alisa", "SDET",120000);
        Testers Rauf = new Testers("Rauf",  "QA", 100000);

        List<Testers> testersTeam = new ArrayList<>();
        testersTeam.addAll(Arrays.asList(Hasan,Alisa,Rauf) );

        for(Testers eachTester  : testersTeam){
            eachTester.getEmployeeInfo();

        }
        System.out.println("-------------------------------------------------------------------------");


        Developers Vlad = new Developers( "Vlad",130000);
        Vlad.getEmployeeInfo();


        Developers Emma = new Developers("Emma",110000);
        Developers Muge = new Developers("Muge",130010);


        List<Developers> developersTeam = new ArrayList<>();
        developersTeam.addAll(Arrays.asList(Vlad,Emma,Muge));

        for( Developers eachDeveloper  :  developersTeam){
            eachDeveloper.fixingBug();
        }



        List<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll( testersTeam   );  // parent class can reference to che child class object
        scrum.addAll(developersTeam);

        for( ScrumTeam eachMember : scrum){
            eachMember.getEmployeeInfo();
        }

    }
}
