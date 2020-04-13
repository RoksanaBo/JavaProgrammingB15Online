package office_hour.Prac_2_10;

class circle{




    public double radius;


    public  circle(double radius){
        this.radius = radius;

    }


    public boolean equals( Object o){
  //      Object o1 = new circle(3.4);
  //      Object o2 = new String();

        if( o instanceof circle)

           if(radius == ((circle) o). radius  )
              return true;

        return false;
    }


}




public class TestCircle {


    public static void main(String[] args) {

        circle c1 = new circle(3.5);
        circle c2 = new circle(3.5);
        Object c3 = new String();


        System.out.println(c1.equals(c2) );
        System.out.println(c2.equals(c3) ); // true








    }
}
