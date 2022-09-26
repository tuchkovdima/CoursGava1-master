package IerarhiaCollection.Multithreading;

public class Ex3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();
        new Thread(()-> System.out.println("privet")).start();

    }
}

/*
Второй способ, как создавать потоки
//Создание
class MyRunnable implements Runnable{public void run(){код}}
//Запуск
new Thread(new MyRunnablelmpl().start);
 */
