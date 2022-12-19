public class Users implements InterA,InterB{

    int rok = 2090;
    @Override
    public void info() {
        System.out.println("Rejestracja: Konferencja IntelliAlg 2023");
    }

    @Override
    public double wartosc(int x) {
        return x;
    }

    @Override
    public double multi(int x, double y) {
        return x*y;
    }

    @Override
    public void opis(int x, double y) {
        System.out.printf("Kwota do zapłaty: %4.2f zł\n",multi(x,y));
    }

    @Override
    public String user(String imie, String nazwisko) {
        return String.format("Uczestnik konferencji: %s %s, opłata wniesiona.",imie,nazwisko);

    }

    @Override
    public void sekcja() {
        System.out.println("sekcja nr 1: algorytmy AI");
    }
}
