package IerarhiaCollection.PriorityQueue;

import java.util.Objects;

public class PriorityQueueEx2 {
    public static void main(String[] args) {

    }
}

class Student implements Comparable<Student> {
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    String name;
    int course;


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
