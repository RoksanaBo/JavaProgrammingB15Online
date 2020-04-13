package day12;

public class LoginTest {

    public static void main(String[] args) {

       /* String str = "abc" ;
        str.equals("abc") —> true       ! str.equals("abc") —>> false
        Create class called LoginTest with main method
                Create 2 String variable called userName , password
        and do following
        // your correct username password is  user123  and pass123
        Check if your username and password correct
        If so print login successful
        If not
        Check whether your username correct
        if not print  , username is not correct
        Check your password is correct or not
        If not print password is not correct

    */



        String userName = "aaa", password = "pass123";

        if(userName.equals("user123") && password.equals("pass123")  ){
            System.out.println("Login Successful");
        }else if( ! userName.equals("user123")    && password.equals("pass123")) {
            System.out.println("user name is not correct");
        }else if( userName.equals("user123")    && ! password.equals("pass123")) {
            System.out.println("password not correct");
        }else {
            System.out.println("username and password are wrong");
        }






    }
}
