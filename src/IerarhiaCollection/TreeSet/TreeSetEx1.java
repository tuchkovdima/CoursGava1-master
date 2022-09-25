package IerarhiaCollection.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        /*
        TreeSet Хранит элементы в отсортированном порядке.
        В основе TreeSet лежит TreeMap. У элементов данного TreeMap: ключи - это элементы TreeSet,
        значение - это константа-заглушка

        Не допускает дубликаты
         */

        Set<Integer> treeset = new TreeSet<>();
        treeset.add(6);
        treeset.add(7);
        treeset.add(3);

        treeset.remove(6);
        System.out.println(treeset);

        System.out.println(treeset.contains(7));

    }

}
