package IerarhiaCollection.Lambda;

import java.util.ArrayList;

import static jdk.internal.org.jline.utils.Colors.M;

public class LambdaEx1 {
    public static void main(String[] args) {

        Student st1 = new Student("Dima", 'm', 21, 4 , 5.5);
        Student st2 = new Student("EVA", 'f', 20, 3 , 5.4);
        Student st3 = new Student("Alice", 'f', 19, 2 , 5.3);
        Student st4 = new Student("Elena", 'f', 18, 1 , 5.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

//        StudentInfo info = new StudentInfo();
//        Object Student;
//        info.PrintStudentsOverGray(StudentInfo, 8);
    }
//    void PrintStudentsOverGray (ArrayList<Student> al, double grade){
//        for (Student s: al) {
//            if(s.avgGrage > grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void PrintStudentUnderAge (ArrayList<Student> al, int age){
//        for (Student s: al) {
//            if(s.age < age){
//                System.out.println(s);
//            }
//        }
//
//    }
//    void PrintStudentMixCondisial (ArrayList<Student> al, int age ,double grade, char sex){
//        for (Student s: al) {
//            if(s.avgGrage > grade && s.avgGrage < grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//    }
}

interface StudentChecks{
    boolean check(Student s);

}
