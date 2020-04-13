package office_hour.Prac_1_14;

public class ScrumTeam {

    public static void main(String[] args) {


        //we are going to create an object

        //reference ссылка         object
        ScrumTeamEmployee      employee01 = new ScrumTeamEmployee();

        employee01.name = "Hasan";
        employee01.employee_ID = 123;
        employee01.jobTitle = "PO";
        employee01.age = 30;
        employee01.salary = 200000;


        //                                   object
        ScrumTeamEmployee employee02 = new ScrumTeamEmployee();
        employee02.jobTitle = "Tester";
        employee02.name = "Maia";
        employee02.employee_ID = 234;


        //method
        employee02.standUP();


        //object
        ScrumTeamEmployee employee03 = new ScrumTeamEmployee();
        employee03.jobTitle = "Developer";
        employee03.name = "Ershat";
        employee03.employee_ID = 345;

        employee03.standUP();

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("employee01's name is: " + employee01.name);
        System.out.println("employee01's job tile is: " + employee01.jobTitle);
        System.out.println("employee01's ID is: " + employee01.employee_ID);

        System.out.println("-----------------------------------------------------------------------------------");

        employee01.getEmployeeInfo();
        employee02.getEmployeeInfo();

        employee01.demo();
        employee02.demo();
        employee03.demo();

    }

}


