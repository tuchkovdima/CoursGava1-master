package IerarhiaCollection.DequeAndArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {
    public static void main(String[] args) {
        /*
        Двунаправленная очередь
        и с переда и сзади

         */

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addLast(8);
        deque.offerFirst(9);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());


    }
}
