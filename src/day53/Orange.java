package day53;


public class Orange extends Fruit {

    //    String taste ;
    //    String color;
          int vcLevel;


 //  implement abstract method:
    public Orange(String taste, String color, int vcLevel) {
        super(taste, color);
        this.vcLevel = vcLevel;
    }

    @Override
    public void getDigested() {

        System.out.println("Orange with Vitamin C level " + vcLevel
                + " has color " + color
                + " and it has " + taste + " taste when you digest");

    }

    @Override
    public String toString() {
        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }



}
