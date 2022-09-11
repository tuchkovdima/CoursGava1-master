package ManyStream.Thread;

import java.io.File;

//уменьшаем файлы двумя потоками
public class Main {
    private static int newWidth = 300;
    public static void main(String[] args) {
        String srcFolder = "/Users/Dima/Desktop/CoursGava/src";
        String dstFolder = "/Users/Dima/Desktop/CoursGava/src";

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();

        //раздеряем на два потока
        int midddle = files.length / 2;

        File[] files1 = new File[midddle];
        System.arraycopy(files, 0, files1, 0 , files1.length);
        //создаем потоки
        ImageResizer resizer1 = new ImageResizer(files1, newWidth, dstFolder, start);
        //запуск потока
        resizer1.start();


        File[] files2 = new File[files.length - midddle]; // взять длинну исходного массива и вычесть половинку
        System.arraycopy(files, midddle, files2, 0, files2.length);
        ImageResizer resizer2 = new ImageResizer(files2, newWidth, dstFolder, start);//файл, новая ширина , папка в которую пишем
        resizer2.start();

        System.out.println("Duration" + (System.currentTimeMillis() - start));
    }
}
