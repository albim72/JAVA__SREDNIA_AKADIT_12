import java.util.ArrayList;

@FunctionalInterface
interface Square{
    int calculate(int x);
}

@FunctionalInterface
interface Policz{
    int calculate(int x,int y);
}

public class Main {
    public static void main(String[] args) {

        int a = 6;
        int h = 12;
        Square s = (int x) -> x*x;
        Square q = (int x) -> x*x*x;
        Policz ee = (int x,int y) -> x+2*y;
        int ans = s.calculate(a);
        int qube = q.calculate(a);
        int pl = ee.calculate(a,h);
        System.out.println(ans);
        System.out.println(qube);
        System.out.println(pl);

        ArrayList<Integer> wyniki = new ArrayList<>();
        wyniki.add(ans);
        wyniki.add(qube);
        wyniki.add(pl);
        wyniki.add(13);

        System.out.println("___________________________________");
        wyniki.forEach(n -> System.out.println(n));
        System.out.println("___________________________________");
        wyniki.forEach(n -> {
            if(n%2==0) System.out.println(n);
        });
    }
}
