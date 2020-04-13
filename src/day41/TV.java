package day41;
/*    TV
    attributes :
    brand , isOn , currentChannel
    String , boolean , int   (range from 1-50)
    behaviours :
    turnOn
            turnOff
    getcurrentChannel
    setcurrentChannel (newChannelNumber)
    moveForward
            moveBackward
*/
public class TV{

    String name;
    boolean isOn ;
    int currentChannel;

    // A method to return the value of current channel for TV
    // return the value of current channel for the TV

    // return the value of current channel for TV
    public int getCurrentChannel(){

        return currentChannel;
    }

    // we can not set a channel if the TV is off!
    // valid channel is from 0-50

    public void setCurrentChannel(int newChannel) {
        // currentChannel = newChannel; //
        // If my channel is out of range i want to exit from the method
        if (newChannel < 0 || newChannel > 50) {
            System.out.println("invalid channel, getting out");
            return; // early exit from the method
        }

        if (isOn == true) {
            currentChannel = newChannel;
        } else {
            System.out.println("turn on the tv first");
        }

    }




    public void turnOn(){

        if(isOn==false) {  // checking for equality
            System.out.println("turn on TV");
            isOn = true;  // assigning the value of isOn to true

        }
    }


    public void turnOff(){

        // if (isOn){ // this will also work
        if(isOn==true){

            System.out.println("turning Off TV");
            isOn= false;
        }
    }

    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }










}



