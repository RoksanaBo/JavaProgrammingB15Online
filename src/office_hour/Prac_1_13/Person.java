package office_hour.Prac_1_13;

import javax.crypto.spec.PSource;

public class Person {


     String firstName;
     String lastName;
     String DOB;



    public void printInfo() {
        System.out.println(String.format("String first name = %s, " +
                                          "last name = %s, " +
                                          "date of birth = %s",
                                          firstName, lastName, DOB));
    }


}
