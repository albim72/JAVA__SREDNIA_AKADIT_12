public class Main {
    public static void main(String[] args) {

        int a=10,b=5,c=10,wynik;
        try {
            wynik = a/(c-2*b);
            System.out.println("wynik: " + wynik);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("jestem końcowym blokiem....");
        }
    }
}
