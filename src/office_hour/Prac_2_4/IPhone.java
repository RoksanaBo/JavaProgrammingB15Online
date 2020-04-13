package office_hour.Prac_2_4;

public class IPhone extends Device {


    String platform ;


    @Override
    public void sendMessage() {
        System.out.println("Hi from IPhone ");

    }


    public void FaceTime(){
        System.out.println("Talking through FaceTime");
    }


    public void call(){
        System.out.println( "calling with IPhone" );
    }
}
