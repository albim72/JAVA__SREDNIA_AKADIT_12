import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> mmapa = new HashMap<>();
        mmapa.put("A",109);
        mmapa.put("B",435);
        mmapa.put("C",new Integer(76));
        mmapa.put("D",new Integer(246));

        for(Map.Entry<String,Integer> m:mmapa.entrySet()){
            System.out.printf("%s: %s\n",m.getKey(),m.getValue());
        }
    }
}
