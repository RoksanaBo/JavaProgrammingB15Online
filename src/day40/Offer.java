package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;
    // this is instance method to print all the information about
    // Offer object


    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);


    }

    public void turnToFullTime(){

        if(isFullTime==false){
            isFullTime=true;
        }else{
            System.out.println("already fulltime");
        }


    }
    // write a method to change the location of the Offer
    // to the location user passed

    public void changeLocation(String newLocation){

        location=newLocation;
    }


    // write a method to accept 4 parameters to change
    // all info about offers

    public void changeAllInfo(String newCompany, String newLocation,
                              long newSalary, boolean newIsFullTime){
        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime =newIsFullTime;

        // an instance method can call another method
        // an instance method can use any instance fields
        // since we already have functionality to display information
        // we called it here to display new information after modifying

        displayInformation();

    }

    // write a method to check the offer belong to 100K club
    // return the result as true false

    public boolean is100KOffer(){

        return salary>=100000; // already generate a boolean result
                               //  so we can directly return that result
    }

     public String toString(){


         String str ="[ Location = " + location + " | " +
                 "Company = " + company + " | " +
                 "Salary = " + salary + " $ | " +
                 "isFullTime = " + isFullTime + "]";
         return str;
     }


}
