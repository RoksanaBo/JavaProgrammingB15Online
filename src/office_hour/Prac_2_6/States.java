package office_hour.Prac_2_6;

public class States {

   String stateName;

   public  void tax(){
       System.out.println("Tax Rate is 5%");
   }


   public final void method1(){
       System.out.println("method1 from States class");
   }

}


class Kentucky extends States{

    String stateName = "KY";

//   Override:
    public void tax(){ System.out.println("Tax Rate in KY is 6% "); }


    public void KFC(){ System.out.println("KY has KFC"); }
//  overloading:
    public final void method1(int a){ System.out.println("method1 from Kentucky"); }


}



class California extends States{

    String stateName = "CA";

    public void tax(){
        System.out.println("Tax Rate in CA is 9% ");
    }

    public void hollyWood(){
        System.out.println("There is Hollywood in CA");
    }


}
