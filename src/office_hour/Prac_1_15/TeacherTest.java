package office_hour.Prac_1_15;

public class TeacherTest {

    public static void main(String[] args) {


        Teacher_Method_ToSet_Both_Parameters t1 = new Teacher_Method_ToSet_Both_Parameters();
//        t1.setName("Svetlana");
//        t1.setAge(19);
        t1.initializeFields("Nuran", 18);

        System.out.println("t1.getAge() = " + t1.getAge());
        System.out.println("t1.getName() = " + t1.getName());


    }

}
