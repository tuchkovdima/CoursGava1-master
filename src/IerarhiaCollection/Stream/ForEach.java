package IerarhiaCollection.Stream;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        /*
        ForEach проходиться по всем элементам и выводить на экран элементы
         */
        int[] array = {5,9,3};
        Arrays.stream(array).forEach(el-> { //forEach говорит, сделай то с этим элементом, что тут написано
            el*=2; //удваиваем эти элементы
            System.out.println(el);});
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(el->Utils.myMetod(el));
    }
}
class Utils{
    public static void myMetod(int a){
        a=a+5;
        System.out.println("Element = " +a);
    }
}