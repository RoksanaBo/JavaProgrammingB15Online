package office_hour;


class data {

    private String password="123456";

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }


    public void printName(){
        System.out.println("Hasan");
    }


    public final int printName(int a ){
        return 10;
    }


}
public final class FinalKeyword extends  data {

    @Override
    public void printName(){
        System.out.println("Mohamed");
    }



    int a;// instance variable
    static double b; // static variable

    public static void main(String[] args) {


     final int num =100; //
        System.out.println(num);

        final String username;
        System.out.println(b);

    }

}
