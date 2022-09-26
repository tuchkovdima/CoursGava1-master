package IerarhiaCollection.Multithreading;

public class Ex1 {
    public static void main(String[] args) {
        MyTread1 myTread1 = new MyTread1();
        MyTread2 myTread2 = new MyTread2();

        myTread1.start();
        myTread2.start();
    }
}
class MyTread1 extends Thread{
    public void run(){
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyTread2 extends Thread{
    public void run(){
        for (int i = 1000; i < 1 ; i--) {
            System.out.println(i);
        }
    }
}
/*
 * Варианты создания нового потока
 * //создание
 * class MyTread extends Thread {public void run (){код который хотим, чтобы наш поток проделывал}}\
 * //Запуск
 * new MyTread().start();
 */