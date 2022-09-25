package IerarhiaCollection.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        /*
        LinkedHashSet является наследником HashSet. Хранит информацию о порядке добавления элементов.

        Производительность методов немного ниже, чем у методов HashSet.
        В основе LinkedHashSet лежит hashMap. У элементов данного hashMap
        ключи - это элементы LinkedHashSet,
        значения - этого константа- заглушка
         */

        /*
       Когда нужен hashset, но когда запоминает последоватльность добавление элементов


         */

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(3);

        System.out.println(hashSet);// как добавили, так и хранятся

        hashSet.remove(3);
        System.out.println(hashSet);

        System.out.println(hashSet.contains(5));


    }
}
