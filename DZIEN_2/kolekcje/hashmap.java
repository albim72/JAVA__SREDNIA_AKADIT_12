import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("Janek",11);
        mapa.put("Olga",23);
        mapa.put("Olaf",20);
        mapa.put("Magda",21);
        System.out.println("Rozmiar mapy: " + mapa.size());
        System.out.println(mapa);

        if(mapa.containsKey("Olaf")) {
            Integer a = mapa.get("Olaf");
            System.out.printf("wartość wynosi: %s",a);
        }
    }
}
