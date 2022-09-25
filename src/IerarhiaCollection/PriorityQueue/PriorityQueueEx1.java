package IerarhiaCollection.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        /*
        Специальный вид очереди, в котором используется натуральная сортировка
        или та, которую мы описываем с помощью Comparable или Comparator.

        Таким образом используется тот элемент из очерди , приоритет которого выше
         */


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(10);
        priorityQueue.add(12);

        //самый верхний элемент
        System.out.println(priorityQueue.peek());
        //наивысший приоретет имеет наименьший элемент



    }
}
