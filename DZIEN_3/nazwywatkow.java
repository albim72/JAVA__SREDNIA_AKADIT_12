import java.time.chrono.ThaiBuddhistEra;

class ThreadNaming extends Thread {
    public ThreadNaming(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Wątek został uruchomiony...");
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadNaming t1 = new ThreadNaming("abc1");
        ThreadNaming t2 = new ThreadNaming("abc2");

        System.out.println("Wątek 1: " +  t1.getName());
        System.out.println("Wątek 2: " +  t2.getName());

        t1.start();
        t2.start();

    }
}
