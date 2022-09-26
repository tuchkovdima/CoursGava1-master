package IerarhiaCollection.Scanner;

import java.util.Scanner;

public class ScanEx1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("vvedite number");

        int i = scanner1.nextInt();
        System.out.println(i);

        System.out.println("Введите два числа");
        int x= scanner2.nextInt();
        int y = scanner2.nextInt();
        System.out.println(x +" "+ y);
        System.out.println("Chastnoe = " + x/y);
        System.out.println("Ostatoc = " + x%y);

        //в строку
        String s = scanner2.nextLine();

    }
}
