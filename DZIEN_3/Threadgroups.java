class NewThread extends Thread
{
    public NewThread(String threadname, ThreadGroup tgob) {
        super(tgob,threadname);
        start();
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " wykonał się...");
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadGroup gg = new ThreadGroup("gg");
        ThreadGroup gg_child = new ThreadGroup(gg,"child");

        NewThread t1 = new NewThread("jeden",gg);
        System.out.println("wątek: jeden startuje");
        NewThread t2 = new NewThread("drugi",gg);
        System.out.println("wątek: drugi startuje");

        System.out.println("liczba wątków grupy: " + gg.activeGroupCount());


    }
}
