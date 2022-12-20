import java.util.AbstractSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            AbstractSet<Integer> abstractSet = new TreeSet<>();

            abstractSet.add(23);
            abstractSet.add(2);
            abstractSet.add(66);
            abstractSet.add(8);
            abstractSet.add(134);
            abstractSet.add(9);

            System.out.println(abstractSet);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
