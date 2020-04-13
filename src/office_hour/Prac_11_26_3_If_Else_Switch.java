package office_hour;

public class Prac_11_26_3_If_Else_Switch {

    public static void main(String[] args) {

        // spring, summer, fall ---> print bears are active
        // winter--> print  bears sleep

        String season = "winter" ;

        if (season.equals("spring") || season.equals("summer") || season.equals("fall")) {
            System.out.println( "bears are active");
        }else if(season.equals("winter")){
            System.out.println("bears sleep");
        }
//       ---------------------------------------------------------------------------

        if(season.equals("spring")) {
            System.out.println("bears are active");
        }else if(season.equals("summer")) {
            System.out.println(" bears are active");
        }else  if(season.equals("winter"))  {
            System.out.println("bears sleep");
        }

  //  ----------------------------------------------------------------------------
          switch(season){
              case "spring":
              case"summer":
              case "fall":
                  System.out.println("bears are active");
              case"winter":
                  System.out.println("bears sleeps");
          }



    }
}
