class Kolory {

    //definicja stanu
    int id;
    String nazwa_koloru;
    String paleta;
    private int nr_paczki;

    public Kolory(int id, String nazwa_koloru, String paleta) {
        this.id = id;
        this.nazwa_koloru = nazwa_koloru;
        this.paleta = paleta;
        this.nr_paczki = 2;
        this.message();
    }

    public void setNr_paczki(int nr_paczki) {
        this.nr_paczki = nr_paczki;
    }

    public void message(){
        System.out.println("utworzono nowy kolor...");
    }

    public String PrintKolor(String info){
        return info  + "nazwa koloru: " + nazwa_koloru + ", paleta: " + paleta + ", numer paczki: " + nr_paczki;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("To jest nowa klasa");
        Kolory c1 = new Kolory(23,"czerwony","Paleta A");
        c1.setNr_paczki(1);
        System.out.println(c1.PrintKolor("To jest nowy kolor -> "));

        Kolory c2 = new Kolory(52,"Jasny szary","Paleta BG");
        System.out.println(c2.PrintKolor("To jest poboczny kolor -> "));

    }
}
