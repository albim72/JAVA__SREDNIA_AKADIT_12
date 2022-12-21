import javax.crypto.spec.PSource;

public class Main {

    public class RunnableImpl implements  Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", wykonuje metodę run()");
        }
    }

    public static void main(String[] args) {

        System.out.println("Wśtek główny: " + Thread.currentThread().getName());
        Thread t1 = new Thread(new Main().new RunnableImpl());
        t1.start();
    }
}
