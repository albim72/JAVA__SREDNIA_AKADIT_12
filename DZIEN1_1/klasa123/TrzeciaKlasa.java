public class TrzeciaKlasa extends DrugaKlasa {

    int d;
    public TrzeciaKlasa(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    public void print_abcd(){
        System.out.println("Wartości: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }

    @Override
    public int sumuj() {
        return a+b+(c+d)*faktor;
    }
}
