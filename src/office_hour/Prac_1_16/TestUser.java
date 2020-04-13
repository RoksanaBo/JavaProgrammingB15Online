package office_hour.Prac_1_16;

public class TestUser {

    int a;

    public static void main(String[] args) {

        //  ClassName   ReferenceName  =  new  ExistingConstructor;

        TestUser t = new TestUser();
     //   System.out.println(t.a);

        UserInfo Alisa = new UserInfo();  // to call the instance of the class

       //  System.out.println(Alisa.userName);   private is not accessible outside the class.

        System.out.println( Alisa.getUsername() );


        Alisa.setUserName("Alisa");
        System.out.println( Alisa.getUsername() );

        Alisa.setSsn("123456");
        System.out.println( Alisa.getSsn());


        UserInfo Kamran = new UserInfo();
        System.out.println( Kamran.getUsername());
        System.out.println( Kamran.getSsn());


    }
}
