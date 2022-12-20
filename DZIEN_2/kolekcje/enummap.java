import java.util.EnumMap;

public class Main {

    public enum rodzaj {
        TEST,
        QUIZ,
        PROJEKT,
        USTNY,
        MIESZANY
    }
    public static void main(String[] args) {

        EnumMap<rodzaj,String> mapaEgzamin = new EnumMap<rodzaj, String>(rodzaj.class);
        mapaEgzamin.put(rodzaj.TEST,"test wielokrotnego wyboru");
        mapaEgzamin.put(rodzaj.QUIZ,"szybki quiz - jednokrotny wybór");
        mapaEgzamin.put(rodzaj.PROJEKT,"indywidualny projekt");
        mapaEgzamin.put(rodzaj.USTNY,"ustan odpowiedź na wybrane pytania");
        mapaEgzamin.put(rodzaj.MIESZANY,"połączenie testu z proejektem");

        System.out.println("rozmiar EnumMap: " + mapaEgzamin.size());

        System.out.println("EnumMAp: " + mapaEgzamin);

        System.out.printf("mapa -> %s: %s\n",rodzaj.MIESZANY, mapaEgzamin.containsKey(rodzaj.MIESZANY));
        System.out.printf("Klucze -> %s\n",mapaEgzamin.keySet());
        System.out.printf("Wartości -> %s\n",mapaEgzamin.values());

        boolean wynik = mapaEgzamin.remove(rodzaj.TEST,"test wielokrotnego wyboru");
        System.out.println("Zmieniona mapa: " + mapaEgzamin);
    }
}
