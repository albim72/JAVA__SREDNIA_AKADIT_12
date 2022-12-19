public class Users implements InterA,InterB{
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
        System.out.printf("Kwota do zapłaty: %f zł",multi(x,y));
    }

    @Override
    public String user(String imie, String nazwisko) {
        return String.format("Uczestnik konferencji: %s %s, opłata wniesiona.",imie,nazwisko);

    }
}
