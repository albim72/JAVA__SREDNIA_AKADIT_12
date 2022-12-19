public abstract class Figura {
    protected double a;
    protected double b;

    public Figura(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figura(double a) {
        this.a = a;
    }

    public abstract double policzPole();
}
