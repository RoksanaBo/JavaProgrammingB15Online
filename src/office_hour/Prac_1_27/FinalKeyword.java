package office_hour.Prac_1_27;




 class data {

    private final String password = "123456";

    public String getPassword(){   // to read it
        return password;
    }

 //   public void setPassword(String password){  // to modify it
 //      this.password = password;
 //   }



    public final void printName(){
        System.out.println("Hasan");
    }


//  when we overloading method with final keyword,
//  return parameter can be same or different ,
//  here we use int instead of void
    public final int printName(int a ){
        return 10;
    }

}





public class FinalKeyword extends data{


/*    @Override
    public void printName(){
        System.out.println("Mohamed");
    }
  */



    final int a=200;       // instance variable
    final static double b = 100; // static variable



    public final static void main(String[] args) {


        final int num = 100; //    final-value cannot be change
         //       num =300;
        System.out.println(num);

        final String userName;
        System.out.println(b);






    }
}


