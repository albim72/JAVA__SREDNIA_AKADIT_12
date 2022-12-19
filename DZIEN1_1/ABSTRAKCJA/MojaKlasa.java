public class MojaKlasa extends Prototyp {
    
    int s;
    public MojaKlasa(int x, int y, int s) {
        super(x, y);
        this.s = s;
    }

    @Override
    public int policz() {
        return (x+y)*s;
    }
}
