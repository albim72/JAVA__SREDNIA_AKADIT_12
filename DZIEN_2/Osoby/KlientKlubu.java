import java.util.StringTokenizer;

public class KlientKlubu extends Osoba {
    
    String nazwa_klubu;
    String miasto;
    double powierzchnia;
    public KlientKlubu(String imie, String nazwisko, int wiek, double waga, double wzrost,
                       String nazwa_klubu, String miasto, double powierzchnia) {
        super(imie, nazwisko, wiek, waga, wzrost);
        this.nazwa_klubu = nazwa_klubu;
        this.miasto = miasto;
        this.powierzchnia = powierzchnia;
    }

    
    public void InfoKlub(){
        System.out.printf("Klub %s, miasto: %s, powierzchnia klubu: %.2f m2",nazwa_klubu,miasto,powierzchnia);
    }
    @Override
    public double policzbmi() {
        return waga/Math.pow((wzrost/100),2);
    }

    @Override
    public String opisbmi() {
        String opis = "";
        if (policzbmi() < 18.5){
            opis = "niedowaga";
        } else if (policzbmi() <= 25) {
            opis = "waga prawidłowa";
        } else if (policzbmi() <= 30) {
            opis = "nadwaga";
        } else if (policzbmi() <= 35) {
            opis = "otyłość stopnia I";
        } else if (policzbmi() <= 40) {
            opis = "otyłość stopnia II";
        }
        else {
            opis = "otyłość stopnia III";
        }
        return opis;
    }

    @Override
    public double policzPPM(String plec) {
        double wynik = 0;
        if (plec == "kobieta") {
            wynik = 655.1 + 9.563*waga + 1.85*wzrost - 4.676*wiek;
        } else if (plec == "facet") {
            wynik = 66.5 + 13.75*waga + 5.003*wzrost - 6.775*wiek;
        }
        else {
            wynik = 0;
        }

        return wynik;
    }
}
