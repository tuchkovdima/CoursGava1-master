package IerarhiaCollection.TreeSet;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Dima", 4);
        Student st2 = new Student("Mmmm", 3);
        Student st3 = new Student("VVV", 2);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);

        System.out.println(treeSet);

        //Первый элемент
        System.out.println(treeSet.first());

        //последний элемент
        System.out.println(treeSet.last());

        //голова
        System.out.println(treeSet.headSet(st1));

        //хвост
        System.out.println(treeSet.tailSet(st3));

        //больше и равно 2 и меньше 4
        System.out.println(treeSet.subSet(st2,st3));

        //сравним
        System.out.println(st3.equals(st2));
        System.out.println(st3.hashCode() == st2.hashCode());

    }
}

class Student implements Comparable<Student> {

    String name;
    int course;


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course ;
    }
//сравнение иде только по курсу
    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public int compareTo(Student other) {
        return this.course-other.course;
    }
}