import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        AbstractSequentialList<Integer> abstract_nb = new LinkedList<>();
        abstract_nb.add(99);
        abstract_nb.add(44);
        abstract_nb.add(11);
        abstract_nb.add(111);
        abstract_nb.add(222);
        System.out.println(abstract_nb);

        abstract_nb.remove(2);
        System.out.println(abstract_nb);

        System.out.printf("Element: %d",abstract_nb.get(0));
    }
}
