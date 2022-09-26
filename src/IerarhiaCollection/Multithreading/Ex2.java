package IerarhiaCollection.Multithreading;

import javax.swing.table.TableRowSorter;

public class Ex2 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyTread3());
        Thread thread2 = new Thread(new MyTread4());
        thread1.start();
        thread2.start();
    }
}
class MyTread3 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyTread4 implements Runnable{
    public void run(){
        for (int i = 1000; i < 1 ; i--) {
            System.out.println(i);
        }
    }
}
