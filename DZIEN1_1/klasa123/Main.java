public class Main {
    public static void main(String[] args) {

        System.out.println("_____________________________________");

        PierwszaKlasa pk = new PierwszaKlasa(3,7);
        pk.print_ab();

        System.out.println("_____________________________________");

        DrugaKlasa dk = new DrugaKlasa(5,8,9);
        dk.print_ab();
        dk.print_abc();
        System.out.println("suma a+b+c*faktor = " + dk.sumuj());

        System.out.println("_____________________________________");
        TrzeciaKlasa tk = new TrzeciaKlasa(5,11,2,4);
        tk.print_ab();
        tk.print_abc();
        tk.print_abcd();
        System.out.println("suma a+b+(c+d)*faktor = " + tk.sumuj());
    }
}
