public class Main {
    public static void main(String[] args) {

        Prostokat pr = new Prostokat(4.6,7.8);
        System.out.printf("Pole prostokąta wynosi %f\n",pr.policzPole());

        Trojkat tr = new Trojkat(6.3,9.9);
        System.out.printf("Pole trójkąta wynosi %f\n",tr.policzPole());
        
        Trapez trp = new Trapez(4.8,3.6,3.2);
        System.out.printf("Pole trapezu wynosi %f\n",trp.policzPole());
    }
}
