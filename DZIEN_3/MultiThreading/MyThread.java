public class MyThread extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Wątek " + Thread.currentThread().getId() + " jest uruchomiony!");

        }
        catch (Exception e){
            System.out.println("problem z wątkiem");
        }
    }
}
