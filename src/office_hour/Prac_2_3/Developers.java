package office_hour.Prac_2_3;

public class Developers extends ScrumTeam {

    // inherited features:
    // variables --> employeeName, jobTitle, salary
    // methods --> grtEmployeeInfo()


    public Developers (String employeeName, double salary){
      this.jobTitle = "Software developer";
      this.employeeName = employeeName;
      this.salary = salary;

    }




    @Override
    public void Demo(){
        System.out.println("Developer  " + this.employeeName + " is duing demo");
    }


    @Override
    public void DailyStandUp(){
        System.out.println("Developer " + this.employeeName + " attended the daily StandUp");
    }


    public void fixingBug(){
        System.out.println("Developer " + this.employeeName + " is crying");
    }
}
