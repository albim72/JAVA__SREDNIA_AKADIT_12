import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> mojaqueue = new LinkedList<>();
        for(int i=0;i<10000;i++){
            mojaqueue.add(i);
        }

        System.out.println(mojaqueue);

        int usun = mojaqueue.remove();
        System.out.println(usun);

        int head = mojaqueue.peek();
        System.out.println(head);

        System.out.println(mojaqueue.size());

        Iterator iterator = mojaqueue.iterator();
        while (iterator.hasNext()){
            System.out.printf("Kolejny element kolejki... %s\n",iterator.next());
        }
    }
}
