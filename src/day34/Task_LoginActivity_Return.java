package day34;

public class Task_LoginActivity_Return {

    public static void main(String[] args) {

        loginVoid("my username", "abc123");  // incorrect password
        loginVoid("user", "abc123");         // correct password

        boolean result = loginReturn("user", "abc123");

        System.out.println("result = " + result);

        System.out.println("second run " + loginReturn("aaaa", "bbb"));

        // System.out.println(    loginVoid("aaaa" , "bbb")    ); CAN NOT DO IT WITH VOID METHOD

        //boolean result2 = loginVoid("abc","efg");

        if (loginReturn("user1", "abc123")) {

            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The order ");

        } else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!!!!");

        }
    }

 /*   login1 :  static void method
      it has two String method parameters
      called username and password
            (it accept 2 String object as argument when being called)
      it check whether username and password  "user" and "abc123"
            if yes ---> print login successful
	  else  --->  print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)

  */

    public static void loginVoid(String user, String password) {
        if (user.equals("user") && password.equals("abc123")) {
            System.out.println(" LOG IN SUCCESSFUL");
        } else {
            System.out.println(" LOG IN FAILED");
        }
    }



 /*   login2 : static method boolean return type
               it has two String method parameters
               called username and password
              (it accept 2 String object as argument when being called)
               it check whether username and password  "user" and "abc123"
            if yes --->  return true
            else ---->   return false

  */
     public static boolean loginReturn(String user, String password) {

         return user.equals("user") && password.equals("abc123");

     }









}
