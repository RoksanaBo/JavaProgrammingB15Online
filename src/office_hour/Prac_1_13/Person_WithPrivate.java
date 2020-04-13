package office_hour.Prac_1_13;

public class Person_WithPrivate {

    private String firstName;
    private String lastName;
    private String DOB;



    public void satFirstName(String firstName){

        if(firstName.length() < 2){
            System.out.println("Name is too short");
        }else{
            this.firstName = firstName;
        }
    }


}
