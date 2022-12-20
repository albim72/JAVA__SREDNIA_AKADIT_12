import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        AbstractList<String> miasta = new ArrayList<>();
        miasta.add("Lublin");
        miasta.add("Warszawa");
        miasta.add("Kraków");
        miasta.add("Wrocław");
        miasta.add("Gdańsk");

        System.out.println("Lista abstrakcyjna: " + miasta);

        AbstractList<String> marki = new LinkedList<>();
        marki.add("Opel");
        marki.add("Toyota");
        marki.add("Jeep");
        marki.add("BMW");
        marki.add("Suzuki");
        System.out.println("Lista abstrakcyjna /linkowana/: " + marki);

        int lastindex = marki.lastIndexOf("Honda");
        System.out.println(lastindex);
    }
}
