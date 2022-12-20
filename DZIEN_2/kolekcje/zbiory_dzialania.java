import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{1,4,5,8,3,6,0,12,7,22,6}));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[]{1,16,5,8,13,6,10,12,77,22}));

        //union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.printf("złączenie dwóch zbiorów: %s\n",union);

        //intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.printf("część wspólna dwóch zbiorów: %s\n",intersection);

        //difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.printf("różnica dwóch zbiorów: %s\n",difference);
    }
}
