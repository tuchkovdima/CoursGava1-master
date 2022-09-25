package IerarhiaCollection.Lambda;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrage;

    public Student(String name, char sex, int age, int course, double avgGrage) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrage = avgGrage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrage=" + avgGrage +
                '}';
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public boolean getAvgGrage() {
//        return avgGrage;
//    }

//    public void setAvgGrage(boolean avgGrage) {
//        this.avgGrage = avgGrage;
//    }
}
