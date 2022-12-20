public abstract class Osoba {
    protected String imie;
    protected String nazwisko;
    protected int wiek;
    protected double waga;
    protected double wzrost;

    protected boolean pracownik;

    public Osoba(String imie, String nazwisko, int wiek, double waga, double wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
        this.pracownik = false;
    }

    public String getOsoba(){
        return String.format("Osoba -> imię: %s, nazwisko: %s, wiek: %d, " +
                "waga: %.2f kg, wzrost: %.2f cm");
    }

    public double wiek_za_N_lat(int n){
        return wiek+n;
    }

    public boolean czypracownik(){
        return pracownik;
    }
}
