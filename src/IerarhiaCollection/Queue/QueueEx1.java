package IerarhiaCollection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        /*
        Queue - это коллекция, хранящая последовательность элементов.
        Добавляется элемент в конец очереди, испоользуется из начала очереди правило fifo

         первый кто пришел, тот и вышел

         */

        Queue<String> queue = new LinkedList<>();
        queue.add("dima"); //добавляет в конец очереди
        queue.add("Lissana");
        queue.add("Elena");
        queue.offer("kona"); //без эксепшн

        System.out.println(queue);

        System.out.println(queue.remove());//удалится первый элемент очереди

        //удаляет элементы, но в случае если очередь пуста эксепшн не вылезает
        System.out.println(queue.poll()); // по 1 элементу скипается

        //показывает верхний элемент в очереди
        System.out.println(queue.element());

        //еслт в очереди ничего не осталось, выведет null
        System.out.println(queue.peek());



        }


    }
