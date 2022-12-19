import java.security.PublicKey;

public enum EPlaneta {
    MERKURY(3.03E+23,2.43E+6),
    WENUS(4.87E+24,6.05E+6),
    ZIEMIA(5.98E+24,6.38E+6),
    MARS(6.42E+23,3.4E+6),
    JOWISZ(1.9E+27,7.15E+7),
    SATURN(5.69E+26,6.03E+7),
    URAN(8.69E+25,2.56E+7),
    NEPTUN(1.02E+26,2.47E+7),
    PLUTON(1.27E+22,1.14E+6);

    private final double masa;
    private final double promien;

    EPlaneta(double masa, double promien) {
        this.masa = masa;
        this.promien = promien;
    }
    
    public double masa(){
        return masa;
    }
    
    public double radius(){
        return promien;
    }
    
    public static final double G=6.673E-11;
    
    public double przeliczGrawitacje(){
        return G*masa/(promien*promien);
    }
    
    public double przeliczWagi(double innaWaga){
        return innaWaga*przeliczGrawitacje();
    }
}
