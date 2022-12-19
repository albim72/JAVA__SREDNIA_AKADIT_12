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
    }
}
