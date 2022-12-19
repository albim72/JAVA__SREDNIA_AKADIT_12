public class Kolo extends Figura {
    public Kolo(double a) {
        super(a);
    }

    @Override
    public double policzPole() {
        return Math.PI*Math.pow(a,2);
    }
}
