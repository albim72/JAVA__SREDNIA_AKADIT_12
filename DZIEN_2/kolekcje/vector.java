import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        int n = 10;
        Vector<Integer> v =new Vector<>(n);

        for(int i=1; i<=n; i++){
            v.add(i+22);
        }

        System.out.println(v);

        v.remove(7);

        System.out.println(v);

        Vector dane = new Vector();
        dane.add(88);
        dane.add(178);
        dane.add("Jan");
        dane.add("Kot");
        dane.add(34);

        System.out.println(dane);

        System.out.println("zamiana danych: " + dane.set(0,112));
        System.out.println(dane);
    }
}
