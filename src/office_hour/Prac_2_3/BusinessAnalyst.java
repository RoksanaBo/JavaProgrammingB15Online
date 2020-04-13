package office_hour.Prac_2_3;

public class BusinessAnalyst extends ScrumTeam {


    // inherited features:
    //      employeeName, jobTitle, salary
    //      getEmployeeInfo

    public BusinessAnalyst(String employeeName, double salary){
        this.jobTitle = "Business Analyst";
        this.employeeName = employeeName;
        this.salary = salary;
    }




    @Override
    public void Demo(){
        System.out.println("Business Analyst " + this.employeeName + " is doing demo");
    }


    @Override
    public void DailyStandUp(){
        System.out.println("Business Analyst " + this.employeeName + " attended daily Stand Up");
    }


    public void gatherRequirement(){
        System.out.println("Business Analyst " + this.employeeName +
                                                  " is gathering the requirement");
    }



}
