package IerarhiaCollection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        /*
        set - коллекция, хранящая уникальные элементы.
        Методы данной коллекции очень быстры
         */
        /*
        Map хранил пары ключ, значение, а для сета такие пары не нужны, каждый элемент Set одно какое то значение

         */
        /*
        HashSet не запоминает порядок добавления элементов.
        В основе HashSet лежит HashMap. У элементов данного HashMap:
        ключи - это Элементы HashSet, значения - константа-заглушка

         */

        Set<String> set = new HashSet<>();
        set.add("Dima");
        set.add("Mon");
        set.add("flaw");
        set.add("Live");
        set.add("Levlar");

      //  set.add(null); // можно

        //удаление
        set.remove("flaw");

        System.out.println(set);

        for (String s: set) {
            System.out.println(s);
        }

        //колличество элементов в set
        System.out.println(set.size());

        //проверка пустой ли set
        System.out.println(set.isEmpty());

        //есть ли такой элемент в нашем множистве
        System.out.println(set.contains("Mon"));





    }
}
