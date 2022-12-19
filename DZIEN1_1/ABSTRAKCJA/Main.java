public class Main {
    public static void main(String[] args) {

        MojaKlasa mk = new MojaKlasa(5,8,19);
        System.out.println(mk.opis());
        System.out.printf("wynik działania = %d\n",mk.policz());
        mk.msg();

    }
}
