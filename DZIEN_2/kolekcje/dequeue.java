import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Deque<String> dwustronna = new LinkedList<>();
        dwustronna.add("Element 1 (Tail)");
        dwustronna.add("Element 2 (Head)");
        dwustronna.add("Element 3 (Tail)");
        dwustronna.add("Element 4 (Head)");
        dwustronna.add("Element 5 (Tail)");
        dwustronna.add("Element 6 (Head)");

        System.out.println(dwustronna);
        dwustronna.removeFirst();
        dwustronna.removeLast();
        System.out.println(dwustronna);

        System.out.println(dwustronna.pop());
        System.out.println(dwustronna.poll());
        dwustronna.push("Element 11 (Tail/Head)");
        System.out.println(dwustronna);

        for(Iterator itr = dwustronna.iterator();
        itr.hasNext();){
            System.out.println(itr.next());
        }

        System.out.println("____________________________");
        for(Iterator itr = dwustronna.descendingIterator();
            itr.hasNext();){
            System.out.println(itr.next());
        }
    }
}
