package office_hour;

public class Prac_12_17 {

    public static void main(String[] args) {

        int number =6;
        String word="java";
        System.out.println(word);
        System.out.println(number);

        //
        System.out.println("I have 8" + 1+2);// 812
        System.out.println("I have 8" + (1+4) ); // 85
        System.out.println(   (2+3) + (3+5)  ); //13
//                     0123456789012345678
        String book = "learn java in 1 day";
        System.out.println(book.length() );
        System.out.println(book.indexOf("j"));// first j index
        System.out.println(book.lastIndexOf("j")); // last index

        //I want only "l":
        System.out.println(book.charAt(0));
        // I want the space:
        System.out.println(book.charAt(5));

        //we can use subString method to get one ore more characters:
 //                       01234
        String student = "Rabia";
        System.out.println(student.substring(2)); // bia
        System.out.println(student.substring(0,1)); // R
        System.out.println(student.substring(4,5));// last a

        System.out.println(student.toLowerCase()); // rebia
        System.out.println(student.toUpperCase()); // Rubia

        int i = 9;
        int lengthOfStudents= student.length();//5
        System.out.println(lengthOfStudents);

        String lowerStudent = student.toLowerCase();
        System.out.println(lowerStudent);

        String batch = "Online";

        //make it uppercase and find length
        System.out.println(batch.toUpperCase().length());  // ONLINE

        System.out.println("Asiya".toUpperCase().toLowerCase().length() );

        //trim
        String a = "Asiya";
        System.out.println(a.trim().toUpperCase() );// Asiya













    }
}
