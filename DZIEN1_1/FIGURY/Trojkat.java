public class Trojkat extends Figura {
    public Trojkat(double a, double b) {
        super(a, b);
    }

    @Override
    public double policzPole() {
        return a*b/2;
    }
}
