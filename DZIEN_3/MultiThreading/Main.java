public class Main {
    public static void main(String[] args) {

        int n=8;
        for (int i=0; i<n;i++){
            MyThread object = new MyThread();
            object.start();
        }
    }
}
