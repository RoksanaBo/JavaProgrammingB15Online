package office_hour.Prac_2_4;

import java.util.ArrayList;
import java.util.List;

public class TestDevice {

    public static void main(String[] args) {


 //     Device --> Samsung --> WaterProof
 //                IPhone

 //     reference       object

 //        Device d = new Device();

 //    reference(d2) parent class
 //    object(new Samsung() type is child class
 //     reference type decides what to access

        Device d2 = new Samsung();
        // d2 doesn't have access any variable or
        // method, created by Samsung.
        d2.price = 88;
        d2.size = 6;
 //     d2.color;  Device (parent) doesn't have it



        WaterProof w = new Samsung() ; // w doesn't have access for any variable
                                       // or methods in Device or Samsung.


//      d3's type is device ==d3 can HAVE ACCESS ONLY variable  + Device
        Device d3 = new IPhone(); // polymorphism ,because parent = new child
        d3.price = 8;
        d3.size = 374;
 //     d3.call(); // this method will be called from Device,
//                    you cannot use anything from IPhone

//      we cannot use anything from IPhone

        IPhone i2 = new IPhone();
        i2.price = 1000;
        i2.size = 5;
        i2.platform = "IOS";
        i2.call(); // after we call() in IPhone class, this method
//                    will be called from IPhone.

        List<String> l = new ArrayList<>();     // same
        ArrayList<String> a = new ArrayList<>(); // same


        Samsung s = new Samsung();
        s.call();
        s.sendMessage();
        s.price = 7; // from Device class
        s.size = 7;  // from Device class
        s.color = "black";  // from Samsung class


        IPhone i = new IPhone();
        i.call();  // I can use call() with Samsung because Samsung and Device are IS-A relationship
        i.sendMessage();











    }
}
