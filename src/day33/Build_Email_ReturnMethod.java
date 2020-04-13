package day33;

public class Build_Email_ReturnMethod {
    public static void main(String[] args) {

        System.out.println(build_GOT_Email("Arya", "Stark"));
        System.out.println(build_GOT_Email("Sam", "Tarly"));

        // you are given a variable fullName that has first name and last name
        // use this full name to generate GOT_Email
        String fullName = "Susan cure";
//        String part1 = fullName.split(" ")[0]  ;
//        String part2 = fullName.split(" ")[1] ;
//          store this resulting email
//        String herEmail =  build_GOT_Email(part1,part2) ;

        String[] fullNameSplit = fullName.split(" ");
        String herEmail = build_GOT_Email(fullNameSplit[0], fullNameSplit[1]);

        System.out.println("herEmail = " + herEmail);


    }

    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com
     * @param firstName user's first name
     * @param lastName  user's last name
     * @return the email created using
     * firstName initial + lastName + @NightWatch.com
     */
    public static String build_GOT_Email(String firstName, String lastName) {

//        String email = firstName.charAt(0) + lastName + "@NightWatch.com";
//        return email ;
        return firstName.charAt(0) + lastName + "@NightWatch.com";
    }


}
