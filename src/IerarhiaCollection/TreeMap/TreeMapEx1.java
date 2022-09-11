package IerarhiaCollection.TreeMap;


import java.util.*;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap1 = new TreeMap<>(); //double оценка студентов

        Student st1 = new Student("Mari", "Tuch", 1);
        Student st2 = new Student("Natali", "Com", 2);
        Student st3 = new Student("Nin", "tan", 2);
        Student st4 = new Student("Mari", "Tuch", 1);
        Student st5 = new Student("Natali", "Com", 2);
        Student st6 = new Student("Nin", "tan", 2);

        treeMap1.put(5.0, st1);
        treeMap1.put(6.7, st2);
        treeMap1.put(5.8,st3);
        treeMap1.put(5.1, st4);
        treeMap1.put(6.4, st5);
        treeMap1.put(5.7,st6);

        System.out.println(treeMap1);// выведется в порядке возрастания

            ArrayList<Car> list1 = new ArrayList<>();
          //  list1.add("coment");
            Car car1 = new Car(1, "Logan", false);
            Car car2 = new Car(2, "Mazda", true);
            Car car3 = new Car(3, "Mers", true);

            list1.add(car1);
            list1.add(car2);
            list1.add(car3);

            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).rozisk == true ){
                    System.out.println(list1.get(i));
                }

            }


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "New");




    }
}
class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }



}
class Car {

    public static boolean course;
    int number;
    String name_car;
     boolean rozisk;

    public Car(int number, String name_car, boolean rozisk) {
        this.number = number;
        this.name_car = name_car;
        this.rozisk = rozisk;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName_car() {
        return name_car;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }

    public boolean isRozisk() {
        return rozisk;
    }

    public void setRozisk(boolean rozisk) {
        this.rozisk = rozisk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && rozisk == car.rozisk && Objects.equals(name_car, car.name_car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name_car, rozisk);
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", name_car='" + name_car + '\'' +
                ", rozisk=" + rozisk +
                '}';
    }




}
