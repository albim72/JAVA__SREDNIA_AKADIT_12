class Kolory {

    //definicja stanu
    int id;
    String nazwa_koloru;
    String paleta;

    public Kolory(int id, String nazwa_koloru, String paleta) {
        this.id = id;
        this.nazwa_koloru = nazwa_koloru;
        this.paleta = paleta;
        this.message();
    }

    public void message(){
        System.out.println("utworzono nowy kolor...");
    }

    public String PrintKolor(String info){
        return info  + "nazwa koloru: " + nazwa_koloru + ", paleta: " + paleta;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("To jest nowa klasa");
    }
}
