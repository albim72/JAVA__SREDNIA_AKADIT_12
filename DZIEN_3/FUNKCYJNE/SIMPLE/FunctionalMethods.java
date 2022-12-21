import java.util.ArrayList;
import java.util.List;

public class FunctionalMethods {

    public int percent1 = 5;
    public int percent2 = 9;
    public final int percent3 = 13;

    /*
        a/ funkcja nie może modyfikować niczego na zewnątrz
        b/ może modyfikować tylko własne argumenty
        c/ nie może wyrzucać wyjątków i błędów
        d/ musi zawsze zwracać wartość
        e/ za każdym razem po wywołaniu z tymi samymi argumentami musi zwrócić ten sam wynik

     */
    public int add(int a,Integer b){
        return a+b;
    }

    public int multi(int a, Integer b){
        a = 5;
        b = 2;
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }

    public int applyTax1(int a) {
        return a/100*(100+percent1);
    }
    public int applyTax2(int a) {
        return a/100*(100+percent2);
    }
    public int applyTax3(int a) {
        return a/100*(100+percent3);
    }

    public List<Integer> append(int i, List<Integer> list){
        list.add(i);
        return list;
    }

    public List<Integer> append2(int i, List<Integer> list){
        List<Integer> result = new ArrayList<>();
        result.add(i);
        percent2++;
        return result;
    }



}
