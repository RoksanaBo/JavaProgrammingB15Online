package office_hour.Prac_2_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {

    String studentName;



    public Student(String studentName){
      this.studentName = studentName;

    }



    public String toString(){
        return studentName;
    }
}



class School{
    String schoolName;
    List<Student> AllStudentsList;



    public School(String schoolName, List<Student> allStudentsList){
        this.schoolName = schoolName;
        this.AllStudentsList = allStudentsList;
    }



    public void AddNewStudent(Student student){
        this.AllStudentsList.add(student);

    }




    public void AddNewStudent(Student[] students){
        this.AllStudentsList.addAll(Arrays.asList(students) );

    }



    public void AddNewStudent(List<Student> listOfStudents){
        this.AllStudentsList.addAll(listOfStudents);
    }


    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", AllStudentsList=" + AllStudentsList +
                '}';
    }

}




public class AssociationExample {

    public static void main(String[] args) {

        Student s1 = new Student("Hasan");

        System.out.println( s1 );  // hashCode
        System.out.println( s1.studentName);

        Student s2 = new Student("Muge");
        Student s3 = new Student("Aiko");
        Student s4 = new Student("Sumeye");
        Student s5 = new Student("Parvin");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

        School cybertek = new School("Cybertek",list);
        cybertek.AddNewStudent(new Student("Irina") );
        cybertek.AddNewStudent(new Student("Denis") );

        Student[] students = {  new Student("Gulnaz") ,
                                new Student("Rukhona")  };

        cybertek.AddNewStudent(students);

        System.out.println(cybertek.AllStudentsList);
  //    System.out.println(cybertek.schoolName); // Cybertek

        for(Student eachStudent : cybertek.AllStudentsList){
            System.out.println(eachStudent);
        }

        System.out.println(cybertek);




    }


}