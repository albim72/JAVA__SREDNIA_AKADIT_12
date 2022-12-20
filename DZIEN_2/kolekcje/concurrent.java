import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {

        ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();
        clq.add(345);
        clq.add(1003);
        clq.add(456);
        clq.add(765);
        clq.add(13354);

        System.out.println(clq);

        ConcurrentLinkedQueue<Integer> clq_2 = new ConcurrentLinkedQueue<>(clq);
        clq_2.add(9765079);
        clq_2.add(11);
        clq_2.add(-76);
        System.out.println(clq_2);

        ConcurrentLinkedQueue<String> miasta_pl = new ConcurrentLinkedQueue<>();
        miasta_pl.add("Toruń");
        miasta_pl.add("Tarnów");
        miasta_pl.add("Słupsk");
        miasta_pl.add("Gliwice");

        System.out.println(miasta_pl);

        ArrayList<String> miasta_eu = new ArrayList<>();
        miasta_eu.add("Londyn");
        miasta_eu.add("Rzym");
        miasta_eu.add("Paryż");
        miasta_eu.add("Praga");
        miasta_eu.add("Oslo");

        System.out.println(miasta_eu);

        boolean response = miasta_pl.addAll(miasta_eu);
        System.out.println("dodana kolekcja: " +response);

        System.out.println("ConcurrentLinkedQueue - ostateczna wersja: " + miasta_pl);
        boolean del = miasta_pl.remove("Oslo");
        System.out.println("ConcurrentLinkedQueue - ostateczna wersja: " + miasta_pl);
    }
}
