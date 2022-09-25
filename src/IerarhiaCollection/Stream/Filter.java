package IerarhiaCollection.Stream;

import IerarhiaCollection.Lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        /*
        filter фильтрует данные из определенного набора

         */
        Student st1 = new Student("Dima", 'm', 21, 4 , 5.5);
        Student st2 = new Student("EVA", 'f', 20, 3 , 5.4);
        Student st3 = new Student("Alice", 'f', 19, 2 , 5.3);
        Student st4 = new Student("Elena", 'f', 18, 1 , 5.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

   //    students.stream().filter(element->element.getAge()>22 && element.getavgGrage()<7.2).collect(Collectors.toList());

    }
}
