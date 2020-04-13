package day10;

public class SeasonAction {
    public static void main(String[] args) {

        /*
        What do you do in each season:
        Spring----> Easter, Blossom
        Summer---> Swim,Vacation ,BBQ, Holiday
        Fall-----> Black Friday, Harvest, Halloween
        Winter---> Christmas, New Year, Ski

         */
        String season = "summer";  // byte,short,int,char,String
        switch (season){

            case "spring":
                System.out.println("Easter,Blossom");
                break;
            case "summer":
                System.out.println("Swim,Vacation ,BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Harvest, Halloween");
                break;
            case "Winter":
                System.out.println("Christmas, New Year, Ski");
                break;
            default:
                System.out.println("Unknown");
        }







    }
}
