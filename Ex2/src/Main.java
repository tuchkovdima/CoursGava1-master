import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

                ArrayList<Car> list1 = new ArrayList<>();

                Car car1 = new Car(1, "Logan", false);
                Car car2 = new Car(2, "Mazda", true);
                Car car3 = new Car(3, "Mers", true);

                list1.add(car1);
                list1.add(car2);
                list1.add(car3);

        System.out.println(list1);

                for (int i = 0; i < list1.size(); i++) {
                    if (list1.get(i).rozisk == true) {
                        System.out.println(list1.get(i));
                    }
                }
    }
        static class Car {


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
        }}

