public class Main {
    public static void main (String[] args) throws CloneNotSupportedException{

        Klon k = new Klon(101,"Projekt 1010101");
        Klon m = (Klon) k.clone();

        System.out.println(m.i);
        System.out.println(m.s);
        
        
    }
}
