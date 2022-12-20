import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {

        AbstractQueue<Integer> Abq = new LinkedBlockingQueue<>();
        Abq.add(15);
        Abq.add(45);
        Abq.add(90);
        Abq.add(180);
        Abq.add(220);
        Abq.add(1500);

        System.out.println(Abq);

        AbstractQueue<Integer> drugaAbq = new LinkedBlockingQueue<>();
        System.out.println(drugaAbq);

        drugaAbq.addAll(Abq);
        System.out.println(drugaAbq);

        int us = drugaAbq.remove();
        System.out.println(us);

        Abq.clear();
        System.out.println(Abq);
    }
}
