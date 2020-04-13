package b12;

public class String_Methods {

    public static void main(String[] args) {


        String str = "Cybertek";
        //            01234567
        //  charAt(index):
        System.out.println(str.charAt(4));  // r
        char ch = str.charAt(4);
        System.out.println(ch);    // r




        String str2 = "Mu htar";
        //index num:   0123456
        System.out.println( str2.charAt(2));


        //  Scanner scan = new Scanner(System.in);
        //  char ch = scan.next().charAt(0);  --     M


        // length() :
        String name = "Donald J Trump";       // 14

        int n = name.length();   //   or directly:
        System.out.println(name.length() );   //  14



        // concat( str ) :
        String s1 = "Cybertek";
        s1.concat(" School");   // returns a brand new String
        System.out.println(s1 );   // String is immutable,
        s1 = s1.concat(" School");
        System.out.println(s1);  // Cybertek School



        // toUpperCase() :
        String N = "cybertek";
        N.toUpperCase();
        System.out.println(N); // cybertek

        N= N.toUpperCase();
        System.out.println(N);  //  CYBERTEK



        // toLowerCase:
        String name1 = "ROKSANA";
        name1.toLowerCase();
        System.out.println(name1); // ROKSANA
        name1 = name1.toLowerCase();
        System.out.println(name1);   // roksana



        // indexOf() :






    }
}
