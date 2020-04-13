package office_hour;

public class Prac_12_16 {

    public static void main(String[] args) {

        String[] names = {"John" , "Kevin", "Scott"};
        System.out.println("First name: " + names[0]);

        for(String name  : names){
            System.out.println(name);
        }

        //

        String[][] students = {
                             {"1", "John" , "35" ,"USA"},
                             { "2", "Kevin" , "40" ,"Brazil"},
                             {"3", "Scott" , "20","Canada"}      };

        System.out.println("How many arrays inside the array we have : " + students.length);

        // How many values in second row(inner array)?
        System.out.println("How many values in second row(inner array)? "+students[1].length);

        // to format your code click option+command+l

        for(String[] arr: students){
            for(String value: arr){
                System.out.print(value +" ");
            }
            System.out.println();
        }
        //how to print student ages
        for(String[] row: students){
            System.out.println(row[2]);// 3rs row represents age
        }
        //














    }
}
