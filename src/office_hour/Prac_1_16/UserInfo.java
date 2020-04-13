package office_hour.Prac_1_16;

public class UserInfo {

    // attributes --> instance variables

    private String userName,  // James
           password,
           ssn;


// default constructor:   default values for the instance variables
    public UserInfo(){
        setUserName("Unknown");
        setSsn("0000000000");
        setPassword("123456");
    }





    // to read the private data only:
    public String getUsername(){
        return userName;
    }


    public void setUserName( String newName ){
       this.userName = newName;

    }


    public String getSsn(){
        return ssn;
    }


    public void setSsn(  String ssn ){
        this.ssn = ssn;
    }



    public String getPassword(){
        return password;
    }


    public void setPassword(String password){
        this.password = password;
    }

}
