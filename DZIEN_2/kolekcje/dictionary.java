import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        Dictionary programista = new Hashtable();
        programista.put("34","projekt");
        programista.put("122","GUI");
        programista.put("45","kod źródłowy główny");
        programista.put("99","modele");

        System.out.println(programista);

        for (Enumeration i = programista.elements();i.hasMoreElements();)
        {
            System.out.println("Wartość słownika: " + i.nextElement());
        }

        for (Enumeration k = programista.keys();k.hasMoreElements();)
        {
            System.out.println("klucze słownika: " + k.nextElement());
        }

        System.out.printf("\nWartość klucza -> 34, wartość elementu: %s",programista.get("34"));
    }
}
