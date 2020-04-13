package office_hour.Prac_2_4;

public class Samsung extends Device {


    String color;

    public void call(){
        System.out.println("Calling with Samsung ");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message with " + color + " of Samsung");
    }



    public void takePictures(){
        System.out.println("Taking a picture");
    }

}
