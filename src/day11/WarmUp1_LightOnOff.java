package day11;

public class WarmUp1_LightOnOff {
    public static void main(String[] args) {

        String targetOption= "ki";

        switch(targetOption) {
            case "bd":
                System.out.println("turn the light on in bedroom");
                break;
            case "Lr":
                System.out.println("turn on the light in living room");
                break;
            case"ki":
                System.out.println("turn on the light in kitchen");
                break;
            case "Ha":
                System.out.println("turn on the light in Hallway");
                break;
            default:
                System.out.println("wrong option");
                break;
        }




    }
}
          /*  Create class called WarmUp1_LightOnOff
        Create a variable  targetOption as String and assign one of below options  for example bd
        You have 4 switches in your home to turn on
        Bd — bedroom
        Lr  — living room
        ki  — kitchen
        Ha— Hallway
        Use switch statement to write a program to print which room light is turned on
        For example if Bd was targetOption
        then print  you have turned on bedroom light

           */