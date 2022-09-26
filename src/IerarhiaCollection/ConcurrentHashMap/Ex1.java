package IerarhiaCollection.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        ConcurrentHashMap имплементтирует интерфейс ConcurrentMap, который в свою очередь происходит от интерфейса Map
         */

        /**
         * в радиционных коллекциях
         * если один поток проходится по элементам с прмощью Iterator например,
         * а второй поток захочет добавить новый элемент, то выйдет Concarentexeption
         *
         * чтобы не вылетала данная ошибка, мы весь код переместили в sunhron блок
         *
         * Любое колличество потоков работает и делит множество элементов на сегменты
         */

        /*
        в ConcurrentHashMap любое колличество потоков может читать элементы не блокируя его

        Благодаря его сегментированию, при изменении какого либо элемента, блокируется только, bucket, в котором он
        находится
         */
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1,"dima");
        map.put(2,"deee");
        map.put(3,"elena");
        map.put(4,"Alice");

        System.out.println(map);

        Runnable runnable1 = () ->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            map.put(6, "fin");

        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
/*
ни key ни value не могут быть null
 */