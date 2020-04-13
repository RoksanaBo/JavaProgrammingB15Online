package day14;

public class EmailChecker {

    public static void main(String[] args) {

        // create a variable called email
        // check for below conditions

        //if it doesn't contain character @ say invalid email
        // if it contains space say invalid email

        // if it endsWith @gmail.com --->gmail
        // if it endsWith @yahoo.com --->yahoo mail
        // if endsWith @mail.ru ---->  russian email

        String email ="roksana@gmail.com";

        if( ! email.contains("@")  ||  email.contains(" ") ) {
            System.out.println("invalid email");

        }else if(email.endsWith("@gmail.com")) {
            System.out.println("gmail");

        }else if(email.endsWith("@yahoo.com")) {
            System.out.println("yahoo email");

        }else if(email.endsWith("@mail.ru")){
            System.out.println("russian email");
        }









    }
}
