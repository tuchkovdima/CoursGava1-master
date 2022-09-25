package IerarhiaCollection.Set;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();

        hashSet2.add(5);
        hashSet2.add(11);
        hashSet2.add(6);
        hashSet2.add(7);
        hashSet2.add(8);

        /*
         Union объединение
        */

        //создаем результирующий HashSet
        HashSet<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet2);
        System.out.println(union);

        /*
        Intersect пересечение общие элементы
         */

        HashSet<Integer> intersect = new HashSet<>(hashSet);
        intersect.retainAll(hashSet2); //оставляет из первого множества только те элементы, которые естть во втором множистве
        System.out.println(intersect);

        /*
        subtruct разность
         */

        HashSet<Integer> subtruuct = new HashSet<>(hashSet);
        subtruuct.removeAll(hashSet2);//которые есть в первом hasset, но нет во втором
        System.out.println(subtruuct);

        System.out.println();
    }
}
