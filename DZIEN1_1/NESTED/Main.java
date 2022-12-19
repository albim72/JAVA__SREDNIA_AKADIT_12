public class Main {
    public static void main(String[] args) {

        Pojemnik.Tak obiekt;
        Otwieranie ot = new Otwieranie();
        obiekt = ot;
        obiekt.show();

        Otwieranie drugi = new Otwieranie();
        drugi.show();
    }
}
