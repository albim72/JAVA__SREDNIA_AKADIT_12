public class DrugaKlasa extends PierwszaKlasa {
    int c;
    public DrugaKlasa(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    
    public void print_abc(){
        System.out.println("Wartości: a = " + a + ", b = " + b + ", c = " + c);
    }

    public int sumuj(){
        return a+b+c;
    }
}
