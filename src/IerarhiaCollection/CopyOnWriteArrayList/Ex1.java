package IerarhiaCollection.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Имплементирует Лист
        Следует использовать тогда, когда вам нужно добиться потокобезопасности, у вас
        небольшое количество операций по изменению элементов и большое колличество по их чтению

         */

        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("dima");
        list1.add("elena");
        System.out.println(list1);

        Runnable runnable1 = ()->{
            Iterator<String> iterator = list1.iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };
        Runnable runnable2 = ()-> {
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            list1.add("Elena");
            list1.add("Eva");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list1);
    }
}

