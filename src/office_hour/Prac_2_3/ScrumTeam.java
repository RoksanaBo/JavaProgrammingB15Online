package office_hour.Prac_2_3;

public abstract class ScrumTeam {



    public String employeeName;
    public String jobTitle;
    public double salary;

    public abstract void Demo();
    public abstract void DailyStandUp();

    public void getEmployeeInfo(){
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Employee name " + employeeName);
        System.out.println("Job Title " + jobTitle);
        System.out.println("salary " + salary);

        System.out.println("-----------------------------------------------------------------------");
    }




}
