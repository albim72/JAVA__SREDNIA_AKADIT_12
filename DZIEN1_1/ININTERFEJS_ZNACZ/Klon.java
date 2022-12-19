public class Klon implements Cloneable {
    int i;
    String s;

    public Klon(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
