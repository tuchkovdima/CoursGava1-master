package IerarhiaCollection.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEx1 {
    public static void main(String[] args) {
        /*
        Stream - последовательность элементов, поддерживающих последовательные и паралельные операции
        над ними

        Поток данных тех что содержит наша коллекция или массив

         */

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("hi");
        list.add("good");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length())); //вместо слов, пишем их длинну
//        }

        //6,2,9
        List<Integer> lst2 = list.stream().map(element -> element.length()).collect(Collectors.toList());//преобразовали в лист

        System.out.println(lst2);
        System.out.println(list);

        int[] arrays = {5, 9, 3, 8, 1};

        //5,3,1,8,1
      arrays =   Arrays.stream(arrays).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray(); //преоразуем поток в массив

        Set<String> set = new TreeSet<>();
        set.add("sks");
        set.add("privet");
        set.add("hi");
        set.add("good");

        System.out.println(set);

        //работа с потоком set
        //6,9,2,4
      Set<Integer> set2 =  set.stream().map(e->e.length()).collect(Collectors.toSet());
      List<Integer> List3 = set.stream().map(e->e.length()).collect(Collectors.toList());

        System.out.println(set2);
    }
}