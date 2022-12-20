import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {

        int rozmiar = 15;
        ArrayBlockingQueue<Integer> qq = new ArrayBlockingQueue<>(rozmiar);
        qq.add(4);
        qq.add(7);
        qq.add(14);
        qq.add(34);
        qq.add(34);
        qq.add(34);
        qq.add(34);
        qq.add(34);
        qq.add(34);


        System.out.println(qq);
    }
}
