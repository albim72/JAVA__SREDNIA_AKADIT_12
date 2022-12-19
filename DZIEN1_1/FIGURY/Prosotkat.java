public class Prostokat extends Figura {
    public Prostokat(double a, double b) {
        super(a, b);
    }

    @Override
    public double policzPole() {
        return a*b;
    }
}
