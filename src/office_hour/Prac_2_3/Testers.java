package office_hour.Prac_2_3;

public class Testers extends ScrumTeam {

    // inherited features:
    // variables --> employeeName, jobTitle, salary
    // methods --> grtEmployeeInfo()


    // constructor:
    public Testers(String employeeName, String jobTitle, double salary) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    @Override
    public void Demo() {
        System.out.println("Tester " + this.employeeName + " is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester " + this.employeeName + " is attending the daily Stand Up");
    }

    public void foundBug() {
        System.out.println("Tester " + this.employeeName + " reported a bug");
    }

}


